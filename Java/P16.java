/*
 How to resolve floating point issue

  int + int = int
  int -  int = int
  int *  int = int
  int / int= int or float
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        float / int = float
         or
        int / float = float
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
*/


import java.util.Scanner;
public class P16{
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter the 1st no:");
         int a = sc.nextInt();
         System.out.print("Enter the 2nd no:");
         int b = sc.nextInt();


               System.out.println("=============Calculation=============");
             System.out.println("Modulus:" + (float)a/b);
      System.out.println("Division:" + ((float)a/b));
       System.out.println("Division:" + (a/(float)b));
}
   
}