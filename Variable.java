/*    Concept of Variable:-
          Variable are the container for storing any value.

          
         let the no = x; 
         let the total = 100;
         
    =>Java is statically typed language , means that before you can assign any value to value jvm wants to know what will be tye
           of the variable.
        Eg:- 
            x = 10 in python
            int x = 10 in java 
            total = 100 in python    
            int total = 100 in java  

   
*/




 public class Variable {
       public static void main(String[] args){
             int x = Integer.parseInt(args[0]);
             int y =  Integer.parseInt(args[1]);
              int result = x + y ;
        System.out.println("1st Value:" + x);
        System.out.println("2nd Value:" + y);
         System.out.println("Result:" + result );
          
   }
}