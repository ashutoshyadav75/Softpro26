// WAP in java to take input from the user.
// Other data types
/*

Concept of Anonymous object and reference object / Variable
  sc = Reference Object or Reference variable when we want to use n of times.
*/


import java.util.Scanner;
public class P13 {
      public static void main(String[] args){
        System.out.print("Enter the name:");
       String name = (new Scanner(System.in)).nextLine();
      System.out.println("Your Name is :" + name);
}
}