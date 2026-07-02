/*   How to take input from user at runtime
 we three standard objects in I/O
stdin: System.in
stdout: Systen.out
stderr: System.error

Hello My name is ashutosh
a-z A-Z 0-9 ~@#$$^&*(

Enter \n
Tab \t
Backspace \b
delete \c 

import java.util.Scanner;
Scanner sc = new Scanner();

// For Input
String : sc.nextLine();
int : sc.nextInt();
double : sc.nextDouble();
byte : sc.nextByte();
float : sc.nextFloat();
one word : sc.next();
one char : sc.next().charAt(0);
Boolean : sc.nextBoolean()

*/


//WAP in java to take input from the user 
// Fully qualified name


public class P10{
           public static void main(String[] args){
         java.util.Scanner sc = new java.util.Scanner(System.in);
                   System.out.print("Enter your Name:  ");
                   String name = sc.nextLine();
                   System.out.println("My name is :" + name);
     }     
}