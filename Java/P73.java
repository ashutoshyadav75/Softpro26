import java.util.Scanner;
public class P73{
    public static void main(String[] args){
  System.out.print("Enter the number for loop:");
             Scanner sc  = new Scanner(System.in);
             int n =  sc.nextInt();

                   int counter = 1;             //Initialization
                  for(;;){
                          if(counter >= 11){                 //Condition
                            break;
                         }
                    System.out.println( n+ "x"+  counter+ "="  +(n*counter ) );

                       // Update
                     counter = counter +1 ;
           }
}

}