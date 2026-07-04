import java.util.Scanner;
public class P74{
    public static void main(String[] args){
  System.out.print("Enter the number for loop:");
             Scanner sc  = new Scanner(System.in);
             int n =  sc.nextInt();
             int multiply;/
  System.out.print("=================First normalization form for the loop=============");
                   int counter = 1;             //Initialization
                  for(;counter != 11;){
                         multiply = counter * n; //Expression
                    System.out.println( n+ "x"+  counter+ "="  +multiply);

                       // Update
                     counter = counter +1 ;
           }
}

}