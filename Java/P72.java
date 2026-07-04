import java.util.Scanner;
public class P72{
    public static void main(String[] args){
  System.out.print("Enter the number:");
             Scanner sc  = new Scanner(System.in);
             int n =  sc.nextInt();

                   int counter = 1;             //Initialization
                  while(counter != 11){
                      
              
     
                    System.out.println( n+ "x"+  counter+ "="  +(n*counter ) );

                       // Update
                     counter = counter +1 ;
           }
}

}