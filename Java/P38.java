/* What is Operator :
==========================
Operator tells the relationship between the operand which when evaluated gives the expected result.

2 [ ] 3 = 5
2 [ ] 3 = 6

where 2 and 3 operands.

How many Operator :- 
==================================================
Are  re kon log special bit assign karenygey.

1. Arithemetic Operator:-  
----------------------------------------------------
        
    a. Unary Operator
    

    b. Binary Operator
    

2. Relational Operator :- 
 -------------------------------------------------------------
  These Operators are used for comparison :
  1. Equality == 
  2. Inequality !=
      a. Strict inequality > or <
      b. Slack inequality  >= or <=

   it return the boolean value as true or false.

3. Logical operator :-
-----------------------------------------------------------------
Logical Operator are used to represent boolean logic .

&&     or logical and :
||     or logical or  : 
!      logical not -> Yes or No or No -> Yes 0 to 1 and 1 to 1  = 
                       
               10 --  boolean --> true
              +10 --  boolean --> true
               1 --  boolean --> true
               +1 --  boolean --> true

              -10 --  boolean --> true
             -1 --  boolean --> true
             0 --  boolean --> flase

    Note:  All integers are boolean true where as oly 0 is boolean false.

      Table of logical && :-
  ============================================================
               A              B        A&&B
            -----------------------------------
               0             0           0
               0             1           0
               1             0           0
               1             1           1


      Table of logical || :-
  ============================================================
               A              B        A||B
            -----------------------------------
               0             0           0
               0             1           1
               1             0           1
               1             1           1

          Table of logical ! :-
  ============================================================
               A              !A        
            -----------------------------------
               0               1         
               1               0


4. Conditional Operator :-
-------------------------------------------------------
It is ternary type of operator.
Ternary means it works in 3 operands.

         Syntax:
    <expression> ? <True Statement> : <False Statement>         
      

5. Assignment Operator : -
--------------------------------------------------------
                          


6. Special Operator:-
-----------------------------------------------
This is meant for special purpose

    1. (.) Dot Operator : System.out.println 
    2. (cast) Operator :  Type Casting
    3. new Operator : used to create the object of the class.
    4. instanceof : used to check of a item belong that class or not it return true or false.

               String name = "Ravi";
              
                 SOP(name instanceof String) // true
                   SOP(10 instanceof String) // false 
     
*/

import java.util.Scanner;
public class P38{
     public static void main(String[] args){
  /*       Scanner sc = new Scanner(System.in);
         System.out.print("Enter the 1st no:");
         int a = sc.nextInt();
         System.out.print("Enter the 2nd no:");
         int b = sc.nextInt();

              System.out.println("Without Unary a:" + (a));
              System.out.println("Unary operator on a:" + (-a));
              System.out.println("Without Unary b:" + (b));
              System.out.println("Unary operator on b:" + (-b));

            System.out.println("-------------------------------------------------------------------------------------------------------------------");
            System.out.println("=============Calculation=============");
            System.out.println("-------------------------------------------------------------------------------------------------------------------");

                   System.out.println("Add :" + (a+b));
                   System.out.println("Substract :" + (a-b));
                   System.out.println("Multiply :" + (a*b));
                   System.out.println("Division:" + (float)(a/b));
                   System.out.println("Remainder :" + (a%b));

          System.out.println("================================================================================================================================================");
 
                    System.out.println("Equality is " +(5==5));
                    System.out.println("Inequality is " +(6!=5));
                    System.out.println("Strict  Inequality > is " +(6>5));
                    System.out.println(" Strict Inequality < is " +(6<5));
                    System.out.println("Slack  Inequality >= is " +(6>=5));
                    System.out.println(" Slack Inequality >= is " +(5>=5));
                    System.out.println("Slack  Inequality <= is " +(4<=5));
                    System.out.println(" Slack Inequality <= is " +(5<=5));
          

         System.out.println("================================================================================================================================================");

                        System.out.println("=============Logical && =============");

                                        System.out.println(" 0 and 0 " + (false && false));
                                        System.out.println(" 0 and 1 " + (false && true));
                                        System.out.println(" 1 and 0 " + (true && false));
                                        System.out.println(" 1 and 1 " + (true && true));
                       
                            System.out.println("=============Logical || =============");

                                        System.out.println(" 0 and 0 " + (false || false));
                                        System.out.println(" 0 and 1 " + (false || true));
                                        System.out.println(" 1 and 0 " + (true || false));
                                        System.out.println(" 1 and 1 " + (true || true));
                     


                             
                            System.out.println("=============Logical ! =============");

                                        System.out.println(" not of  0 " + (!false));
                                        System.out.println(" not of 1 " + (!true));
                                     

         System.out.println("================================================================================================================================================");
                   
                                     System.out.println("=============Conditional Operator =============");
                                             String message;
                                       Scanner mes = new Scanner(System.in);
                                       System.out.print("Enter the no:");
                                        int no = mes.nextInt();

                                  message = (no>0) ? no+ "is +ve" : no+ "is -ve" ;
                                   System.out.println(message);
  

                          System.out.println("=============Conditional Operator for Odd and Even =============");
                                             String number;
                                       Scanner eo = new Scanner(System.in);
                                       System.out.print("Enter the no:");
                                        int m = eo.nextInt();

                                  number = (m % 2 == 0) ? m+ " No. is Even" : m+ " No. is Odd" ;
                                   System.out.println(number);


                                System.out.println("=============Conditional Operator for Modulus =============");
                                             String modulus;
                                       Scanner mod = new Scanner(System.in);
                                       System.out.print("Enter the no:");
                                        int x = mod.nextInt();

                                  modulus = ( x > 0) ? x+ " X is Positive " : (-x) + " X is positive" ;
                                   System.out.println(modulus);



                      System.out.println("================================================================================================================================================");
                   
                                     System.out.println("=============Assignment Operator =============");

                         
                                                    int a = 10;
                                                    int b = 8;
                                                    int c = 5;
                                                    int d = 4;
                                                    a = a + 1 ;
                                                    System.out.println("Value of a " + a );
                                                    b = b -1 ;
                                                    System.out.println("Value of b " + b );
                                                      b-=2;
                                                        System.out.println("Value of b " + b );
                                                     c = c * 2 ;
                                                            System.out.println("Value of c " + c );

                                                      c *= 2 ;
                                                            System.out.println("Value of c " + c );
                                                       d = d / 2 ;
                                                            System.out.println("Value of d " + d);

                                                      d /= d ;
                                                            System.out.println("Value of d " + d );

                                       */       
                                                    
}
   
}
