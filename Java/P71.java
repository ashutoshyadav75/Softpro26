import java.util.Scanner;
public class P71{
    public static void main(String[] args){
  System.out.print("Enter the number:");
             Scanner sc  = new Scanner(System.in);
             int n =  sc.nextInt();

                   int counter = 1;             //Initialization
                  while(true){
                          if(counter >= 11){                 //Condition
                            break;
                         }
                    System.out.println( n+ "x"+  counter+ "="  +(n*counter ) );

                       // Update
                     counter = counter +1 ;
           }
}

}