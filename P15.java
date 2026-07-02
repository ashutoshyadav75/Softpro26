/* WAP in java to make the calculator with operation + , - , * , / , % 



*/


import java.util.Scanner;
public class P15{
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter the 1st no:");
         int a = sc.nextInt();
         System.out.print("Enter the 2nd no:");
         int b = sc.nextInt();


               System.out.println("=============Calculation=============");
      System.out.println("Addition:" + (a+b));
      System.out.println("Substract:" + (a-b));
      System.out.println("Multiply:" + (a*b));
      System.out.println("Division:" + (a/b));
      System.out.println("Modulus:" + (a%b));
}
}
