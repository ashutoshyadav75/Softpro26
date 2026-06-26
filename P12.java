// WAP in java to show case escape character sequence.
// Escape character = \n , \b(Back , \c 




public class P12{
         public static void main(String[] args){
           System.out.println("This is the 1st line");
           System.out.println("Tihs is 2nd in \n next line");
             System.out.println("Tihs  \t tabbed line");
                System.out.println("This Ashu\b\btosh Yadav");
     // Note: \b does not work if end of line is reached.
              System.out.println("This Ashutosh Ya\bdav\b\b");
           }
}