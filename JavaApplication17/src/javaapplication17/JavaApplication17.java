package javaapplication17;

import javax.swing.JOptionPane;

public class JavaApplication17 {

    static void Descending(double arr[][])
    {
        double temp;
        
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++)
                for (int k = (j+1); k < arr[i].length; k++)
                    if(arr[i][j] < arr[i][k])
                    {
                        temp = arr[i][j];
                        arr[i][j] = arr[i][k];
                        arr[i][k] = temp;
                    }
    }
    static String HitghSales(double arr[][])
    {
        double HitghSales = 0;
        int index = 0;
        
        for (int i = 0; i < arr.length; i++)
            for (int j = (i+1); j < arr.length; j++)
                if(arr[i][0] > arr[j][0])
                    {
                        HitghSales = arr[i][0];
                        index = i+1;
                    }
        String p = "The Brunch No. " + index + " Have " + HitghSales + " SR";
        return p;
    }
        
    public static void main(String[] args) {
        
        double brunch_month[][] = new double [4][3] , HigthBrunchSales = 0 , index = 0;
        String p = "";
        for (int i = 0; i < brunch_month.length; i++)
            for (int j = 0; j < brunch_month[i].length; j++)
                brunch_month[i][j] = Double.parseDouble(JOptionPane.showInputDialog("Enter The Sales of Brunch No. " + (i+1) + " & Month No. " + (j+1) + " : "));

            
        Descending(brunch_month);
        
        for (int i = 0; i < brunch_month.length; i++)
        {
            for (int j = 0; j < brunch_month[i].length; j++)
                p += brunch_month[i][j] + " | ";
            p += "\n";
        }
        p += HitghSales(brunch_month);
                
        JOptionPane.showMessageDialog(null, p);
        
    }
    
}
