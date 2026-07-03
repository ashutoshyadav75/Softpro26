// WAP of odd and even by switch


import java.util.Scanner;
public class P54{
     public static void main(String[] args){ 
            int n = 0;
           Scanner sc = new Scanner(System.in);
           System.out.print("Enter the numbers:");
             n = sc.nextInt(); 
         switch(n%2){
             case 0:
         System.out.print("The given number is Even");
           break;
          default:
           System.out.print("The given number is Odd");
     }
        }
         }  