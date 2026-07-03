// WAP in java to find consonat or vowels.
//Vowels: a , e , i ,o ,u 


import java.util.Scanner;
public class P53{
      public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
         System.out.print("Enter the character:");
              char ch = sc.next().charAt(0);
                    Character lower = Character.toLowerCase(ch);            
    
              switch(lower){
                 case 'a':
               
                    case 'e':
                 
                  case 'i':
             
                    case 'o':
                 
                 case 'u':
                  System.out.print("Given Character is Vowels");
                          break;
                     default:
                        System.out.print("Given Character is Consonants");

                 }
}
}
                    