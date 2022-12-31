package javaapplication19;

import javax.swing.JOptionPane;

public class JavaApplication19 {
    
    static void Ascending(double arr[])
    {
        double temp;
        for (int i = 0; i < arr.length; i++)
            for (int j = (i+1); j < arr.length; j++)
                if(arr[i] > arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
    }
    
    static void Descending(double arr[])
    {
        double temp;
        for (int i = 0; i < arr.length; i++)
            for (int j = (i+1); j < arr.length; j++)
                if(arr[i] < arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
        
    }
    
    static double avg(double arr[])
    {
        double total = 0 , avg;
        for (int i = 0; i < arr.length; i++)
            total += arr[i];
        avg = total / arr.length;
        return avg;
    }
    
    static String search(double arr[] , double s)
    {
        String p = "The Item you search about it is : " + s + " & The status is : ";
        
        for (int i = 0; i < arr.length; i++)
        if(arr[i] == s)
            return p += "TRUE & The index number is arr[" + i + "]\n";
            
        return p += "False\n";
    }
        
    public static void main(String[] args) {
        
        int n , m;
        String p = "The Array Information is \n--------------------------\n";
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog("Enter how many numbers you have : "));
        } while (n <= 0);
        
        double arr[] = new double [n] , s;
        p += "The Array items is : \n";
        
        for (int i = 0; i < n; i++)
        {
            arr[i] = Double.parseDouble(JOptionPane.showInputDialog("Enter The number No. " + (i+1) + " : "));
            p += arr[i] + " | ";
        }
        
        do
            m = Integer.parseInt(JOptionPane.showInputDialog("If you want to search Item Please chose : \n1 - YES \n2 - NO"));
        while (m < 1 || m > 2);
        
        p += "\n--------------------------\n";
        p += "The Array After Ascending is : \n";
        
        Ascending(arr);
        for (int i = 0; i < n; i++)
            p += arr[i] + " | ";
        p += "\n--------------------------\n";
        
        p += "The Array After Descending is : \n";
        Descending(arr);
        for (int i = 0; i < n; i++)
            p += arr[i] + " | ";
        p += "\n--------------------------\n";
        
        p += "The AVG of The Array is : " + avg(arr);
        p += "\n--------------------------\n";
        
        switch (m)
        {
            case 1:
                s = Double.parseDouble(JOptionPane.showInputDialog("Enter The Item : "));
                p += search(arr,s);
                break;
        }        
        
        JOptionPane.showMessageDialog(null, p);
    }
    
}
