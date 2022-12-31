package javaapplication21;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class javaapplication21 {
    //Date & Time
    static String DateTime()
    {
        String formattedDate;
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        return formattedDate = myDateObj.format(myFormatObj);
    }
    //Descending
    static String Descending(double arr[][])
    {
        double temp;
        String p = "The Sales for Brunch No. \n";
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[i].length; j++)
                for (int k = (j+1); k < arr[i].length; k++)
                    if(arr[i][j] < arr[i][k])
                    {
                        temp = arr[i][j];
                        arr[i][j] = arr[i][k];
                        arr[i][k] = temp;
                    }
        for (int i = 0; i < arr.length; i++)
        {
            p += (i+1) + " - ";
            for (int j = 0; j < arr[i].length; j++)
                p += arr[i][j] + " | ";
            p += "\n";
        }
        p += "--------------------------------------------------\n";
        return p;
    }
    //Hitgh Brunch Sales
    static String HitghSales(double arr[][])
    {
        double HitghSales ;
        int index ;
        String p = "";
        for (int i = 0; i < arr.length-1; i++)
            for (int j = (i+1); j < arr.length; j++)
                if(arr[i][0] > arr[j][0])
                    {
                        HitghSales = arr[i][0];
                        index = i+1;
                        return p = "The Brunch No. " + index + " Have The Hitgh Sales " + HitghSales + " \n--------------------------------------------------\n";
                    }
                
        return p;
    }
    //Total Brunch Sales in the month
    static String HitghSalesMonth(double arr[][])
    {
        double total = 0;
        String p = "The Hitgh Sales in Month for Brunch No. \n";
        
        Descending(arr);
        
        for (int i = 0; i < arr.length; i++)
            p += (i+1) + " - " + arr[i][0] + "\n";
        p += "--------------------------------------------------\n";
        
        return p;
    }
    //Total Brunch Sales in the year
    static String TotalSalesYear(double arr[][])
    {
        double total = 0;
        String p = "The Total Sales in year for Brunch No. \n";
        
        for (int i = 0; i < arr.length; i++)
        {
            p += (i+1) + " - ";
            for (int j = 0; j < arr[i].length; j++)
            {
                total += arr[i][j];
            }
            p += total + "\n";
            total = 0;
        }
        p += "--------------------------------------------------\n";
        
        return p;
    }
    //AVG Brunch Sales
    static String AvgSales(double arr[][])
    {
        double total = 0 , avg[] = new double [arr.length];
        String p = "The AVG Sales for Brunch No. \n";
        
        for (int i = 0; i < arr.length; i++)
        {
            p += (i+1) + " - ";
            for (int j = 0; j < arr[i].length; j++)
                total += arr[i][j];
            avg[i] = total / arr[i].length;
            total = 0;
            p += Math.round(avg[i]) + "\n";
        }
        p += "--------------------------------------------------\n";
        
        return p;
    }
    //Quarters Brunch Sales
    static String Quarters(double arr[][] , int n)
    {
        String p = "";
        double total = 0;
        switch(n)
        {
            case 1:
                for (int i = 0; i < arr.length; i++)
                {
                    p += (i+1) + " - ";
                    for (int j = 0; j < arr[i].length; j++)
                    {
                        total += arr[i][j];
                    }
                    p += total + "\n";
                }
                     
//                    p += (i+1) + " - " + arr[i][0] + "\n";
                break;
            case 2:
                for (int i = 0; i < 4; i++)
                    p += (i+1) + " - " + arr[i][0] + "\n";
                break;
            case 3:
                for (int i = 0; i < 4; i++)
                    p += (i+1) + " - " + arr[i][0] + "\n";
                break;
            case 4:
                for (int i = 0; i < 4; i++)
                    p += (i+1) + " - " + arr[i][0] + "\n";
                break;
        }
        
        p += "--------------------------------------------------\n";
        
        return p;
    }
    
    public static void main(String[] args) {
        
        double brunch_month[][] = new double [3][12];
        String p = "Green Flag \nThe bill Information at " + DateTime() + " Is \n--------------------------------------------------\n";
        
        try
        {
            for (int i = 0; i < brunch_month.length; i++)
            for (int j = 0; j < brunch_month[i].length; j++)
                brunch_month[i][j] = Double.parseDouble(JOptionPane.showInputDialog("Enter The Total Sales of Brunch No. " + (i+1) + " & Month No. " + (j+1) + " : "));
            
            JOptionPane.showMessageDialog(null, p + Descending(brunch_month) + HitghSales(brunch_month) + TotalSalesYear(brunch_month) + HitghSalesMonth(brunch_month) + AvgSales(brunch_month));
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"ERROR In Input\nThe ERROR IS : " + e);
        }
        
        
    }
    
}