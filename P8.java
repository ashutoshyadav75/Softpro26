/*
Concepts of concatenation
       int + int = int
       str + int = str
       int + str = str
       str + str = str 
                                       Typecasting : one datatype --> another datatype
                                        string  --> int --> Interger.parseInt(10)  --> 10
                                                                               |       |
                                                                               str     int

*/ 


 public class P8 {
       public static void main(String[] args){
        System.out.println("1st Value:" + args[0]);
        System.out.println("2nd Value:" + args[1]);
         System.out.println("Concatenation:" +  args[0] + args[1]);
          System.out.println("Addition:"  Integer.parseInt(args[0]) + Integer.parseInt(args[1]));
   }
}