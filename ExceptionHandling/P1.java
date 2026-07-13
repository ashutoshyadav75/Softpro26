// Thows and Throw
    
import java.util.*;
public class P1{
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age:");
         int age = sc.nextInt();
         if(age <18){
            throw new Exception("Invalid age");
         }
         System.out.println("Valid Age");

    }
}