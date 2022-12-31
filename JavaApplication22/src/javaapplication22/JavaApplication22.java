package javaapplication22;

public class JavaApplication22 {

    static double mymethod(double num)
    {
        if(num >= 1)
        {
            num = num * mymethod(num - 1);
        }
        return num;
    }
    public static void main(String[] args) {

      double num = 5;
      
        System.out.println(mymethod(num));
    }
}
