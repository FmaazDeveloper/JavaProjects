package app2;
import javax.swing.JOptionPane;
class app {

	public static void main(String[] args) {
    	int n ;
    	int total = 0 ;
    	int item ; 
    		n=Integer.parseInt(JOptionPane.showInputDialog("enter the number : "));
    		int m[] = new int [n];
    		int x[] = new int [n];
    		for (int i=0; i<n; i++)
    		{
        		x[i]=Integer.parseInt(JOptionPane.showInputDialog("enter the numbers : "));
    		}
    		item=Integer.parseInt(JOptionPane.showInputDialog("enter the item : "));
    		for (int i=0; i<n; i++)
    		{
    			if(x[i] == item)
    			{
    				total = total + 1 ;
    			}    		
    		}
    		System.out.println(total);
}
}