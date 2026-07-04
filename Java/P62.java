import java.util.Scanner;
public class P62{
       public static void main(String[] args){
                System.out.print("Enter the number:");
                  Scanner sc = new Scanner(System.in);
                   int n = sc.nextInt();

                    String output[]  =  {"Even" , "Odd"}; 

                     
                      System.out.print( n + " is " + output[n%2]);
                  
                      
   }

}

