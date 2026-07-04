//WAP in java odd and even by varaiable overriding
import java.util.Scanner;
public class P56{
       public static void main(String[] args){
                System.out.print("Enter the number:");
                  Scanner sc = new Scanner(System.in);
                   int n = sc.nextInt();
                    String output = "Odd";

                       if(n%2==0){
                      System.out.print("Even");
                  
                       }
                    
                         System.out.print(n + " is " + output);
                      }

}


