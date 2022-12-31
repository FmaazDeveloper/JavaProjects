package app;
import javax.swing.JOptionPane;
class app {
	static double tax (double total)
	{
	double tax = total * 0.15 ;
	return tax ;
	}
	public static void main(String[] args) {
		String branch , name2 ;
		int n ;
		double price2 ;
		 branch = JOptionPane.showInputDialog("أدخل رقم الفرع : ");
		 n = Integer.parseInt(JOptionPane.showInputDialog("أدخل عدد المنتجات : ")) ;
		if (n > 0)
		{
		String name [] = new String [n];
		double price [] = new double [n];
		double total = 0 ;
		for (int i = 0 ; i < n ; i++)
		{
			 name[i] = JOptionPane.showInputDialog("أدخل اسم المنتج " + (i+1) + " : ");
			 price[i] = Double.parseDouble(JOptionPane.showInputDialog("أدخل سعر المنتج " + (i+1) + " : ")) ;
			 total += price[i] ;
		}
		double dis = 0;
		switch (branch)
		{
		case "1" : 
			if (total > 100)
				dis +=  total / 10 ;
			break;
		case "2" :
			    dis += tax(total) ;
			break;
		case "3" : 
			if (total > 500)
				dis += 50 ;
			break;
		}
		for (int i = 1 ; i < n ; i++)
		{
			for (int j = 0 ; j < n-1 ; j++)
			{
				if (price[j] > price[j+1])
				{
					price2 = price[j] ;
					price[j] = price[j+1] ;
					price[j+1] = price2 ;
					name2 = name[j] ;
					name[j] = name[j+1] ;
					name[j+1] = name2 ;
				}
			}
		}
		for (int i = 0 ; i < 1 ; i++)
		{
		System.out.println("ـــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــ" + "\n" + "مرحبا بكم في صيدلية العلم الأخضر " + "\n" + "رقم الطلب هو : " + (i+1) + "\n" + "ـــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــ");
		}
		for (int i = 0 ; i < n ; i++)
		{
			System.out.println("اسم المنتج رقم " + (i+1) + " هو : " + name[i] + "\n" + " سعر المنتج رقم " + (i+1) + " هو : " + price[i] + "\n" + "ـــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــ" + "\n");
		}
		System.out.println("مجموع المبيعات هو : " + total + "\n" + " قيمة الضريبة المضافة هي " + tax(total-dis) + "\n" + " المجموع هو : " + (total + tax(total-dis)) + "\n" + " مقدار الخصم هو : " + dis + "\n" + " المجموع الكلي بعد الخصم هو : " + (total + tax(total-dis)-dis) + "\n" + "ـــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــــ");
		}
		else
			System.out.println("ERROR");
}
}