//WAP in java to check prime number among 1 to 100.
import java.util.Scanner;
public  class P67{
            public static void main(String[] args){
           System.out.print("Enter the number:");
             Scanner sc  = new Scanner(System.in);
             int n =  sc.nextInt();
           if(n>0 && n<=100){
               if(n%2==0){
                     if(n==2){
                     System.out.print("Prime Number");
                }  
                  else {
                     System.out.print("Not prime number");
                  }
           }else if(n%3==0){
                     if(n==3){
                     System.out.print("Prime Number");
                }  
                  else {
                     System.out.print("Not prime number");
                  }
             }else if(n%7==0){
                     if(n==7){
                     System.out.print("Prime Number");
                }  
                  else {
                     System.out.print("Not prime number");
                  }
            }
}}
}


  