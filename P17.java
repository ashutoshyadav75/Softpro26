/*   By default every decimal point is double type
       
       double (64) bit --> float (32) bit --> data loss
   that is why java will raise error because we asking java to change type automatically from double to float .
  it  raises error 

     float a = 10.5f;
     float a  = 10.5f;

*/


import java.util.Scanner;
public class P17{
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
           float pi =3.14f;
          System.out.println("Value of pi : " + pi );
}
}




