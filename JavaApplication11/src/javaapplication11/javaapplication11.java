package javaapplication11;
 
import java.util.Scanner;
 
public class javaapplication11 {
 
   public static int search(int a[], int x) {
 
       int n = a.length;
 
       for (int i = 0; i < n; i++) {
 
           if (a[i] == x) {
               return i;
           }
 
       }
 
       return -1;
 }
 
   public static void main(String args[]) {
       Scanner scan = new Scanner(System.in);
       int a[] = new int[5];
       System.out.print("ENter five Elements ");
 
       for (int i = 0; i < 5; i++) {
           a[i] = scan.nextInt();
       }
       System.out.print("Enter Key ");
       int key = scan.nextInt();
 
       int result = search(a, key);
 
       if (result == -1) {
           System.out.print("Element not found ");
       } else {
           System.out.print("Element found at position  " + result);
       }
 
   }}