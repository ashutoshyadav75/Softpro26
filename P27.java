/*
  ================================
  =        gcc -c p2.c           =
  =        gcc p2.o -o p2.exe    =
  =         p2.exe               =
  ================================
-----------------------------------------------------------------------------------------------------------------------------------------------------------------
Recursion :-   
   It is a non ansi standard practice to achieve a task which has to be repeated n of times.
   -> For saying hello 10 times.
   
  Recursion itself is a cycle in nature. 
  Cyclic : End and start must be concide.

---------------------------------------------------------------------------------------------------------------------------------------------------------------
    When a fn call iteself on a cycle manner then it is called as Recursion.

      1. Controlled Recursion : When a tpes are finite , and cycle runs in control manner.
      2. Uncontrolled Recursion : When steps are 
---------------------------------------------------------------------------------------------------------------------------------------------------------------

   How to control Recursion:-
===========================================================
    1. Maintain a counter
        counter = 1
    2. Base Condition
       if(counter == 10){
             return;
        }
    3.Update counter
        counter = counter + 1;
         <new>     <old>+1
    4. Statement which you want to execute by default is put in race condition .
          
       cycle(){
         if(counter == 10){
            return;
         } else{
          System.out.println("Hello World")
        }
        }
*/

public class P27{
     public static void main(String[] args){
               a();
      }
   
   public static void a(){
      System.out.println("A is executing");
              b();
}

   public static void b(){
         System.out.println("B is executing");
          c();
}

   public static void c(){
     
 System.out.println("C is executing");
         a();
}
}