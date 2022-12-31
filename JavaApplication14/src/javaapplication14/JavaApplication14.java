package javaapplication14;

import javax.swing.JOptionPane;

public class JavaApplication14 {
    static void x(int x , int y)
    {
        int z = x + y;
        String p = "The Totatl of x = " + x + " + y = " + y + " = " + z;
        JOptionPane.showMessageDialog(null, p);
    }
    static double sum(double n1 , double n2)
    {
        double z = n1+  n2;
        return z;
    }
    static int sum(int n1 , int n2)
    {
        int z = n1+  n2;
        return z;
    }
    public static void main(String[] args) {
        x(1,2);
        JOptionPane.showMessageDialog(null,"Sum double : " + sum(5.25,10.25));
        JOptionPane.showMessageDialog(null,"Sum int : " + sum(15,20));
        
    }
    
}
