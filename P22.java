git /*  Dijikastra Algorithm of random Range

 let r be random factor , and min and max are range of numbers 
min = 1000
max = 9999
range = r*diff of max/min + max (range = r*(max-min) +max)
r = Math.random()


range = Math.random()*(max-min)

============================================================================================================================================================================================
   Three important principal in programming methodology
   1. DRY : denote repeat yourself
             a. Modular
             b. Functional
             c. OOPS
             d. Design pattern

   2. KISS : keep it simple or sweet
             keep it straight and simple
             keep it simple and stupid

   3. SOLID Principal :single responsiblity principal
            S:
            O:
            L:
            I:
            D:
============================================================================================================================================================================================
*/


public class P22{
     public static void main(String[] args){
             int min = 1000;
              int max = 9999;
               double r = (Math.random() -1);
                int range = (int)(r*(max-min)+ max );
 System.out.println("Number: " + range);
}
}