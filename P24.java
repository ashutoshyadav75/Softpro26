
/*
============================================================================================================================================================================================
Concept of Modularity : Instead of the writing the entire code in a single file we can write the code in the different files, this concept is called modularity and breaking the code different,  files are called modules , or headerfile , ore even packages in some languages.

This enhances the readibility of the code , and maintain of the code.

    Programming Paradigm/Pattern/ Methodology/Techniques
         1.Procedural : step by step
         2. Functional : we use special blocks called as functions
         3. OOPs : used classes  and object for writing the code
         4. Design Pattern(Gang of Four)
               a. creational
               b. Strucutral
               c. Behaviour

 Functional Approach:-
  Function: BLoack of code , which performs a specific task.
 
 Function can be classified into two categories-
  1. Ready made or predefined or Builtin 


       e.g.:
           System.out.println()
           Math.random()
           Math.pow()
            Integer.parseInt()
             sc.nextInt()
             sc.nextLine()
     
  2. Userdefined functuions :- we are(user) responsible for creating it and using it.

       e.g.: dance() 
  
         Note: In java we define the access type wheather other can use our function or not.

       Anyone: public
       self : private


     Serial:- Kyunki saas bhi kabhi bahu thi 
       i.e.: Every predefined function was user defined once.

   UDF is a like a pickel ( achar ) make it once use n of items.

   
Syntax of Functions:
==============================
<access modifier> static  <return-type>  nameoffunction(){  }
       |             |             |
public/private   so that      int,String, 
                 we call fn   boolean,byte,
                 without      float,double
                  object


     y = 4x 
       x --> Independent Variable
       y --> Dependent Variable

     y = f(x) = 4x 
 
x --> input  y----> output 

-------------------> input f(x) ----------------------------> output 
square(x)
A function can take n of input  , and can generate n no. of output.

fn(x,y,z) : x , y , z are 3 input( Parameter or argumnet) 
return keyword --> output.

N of inputs so total no. of output combination = 2^N
  Input and Output  => 2^2 = 4
   0          0         No argument No return type                         
   0          1         No argument with return type
   1          0         With argument No return type
   1          1         With argument with return type
 
=========================================================================================================================================================================================

*/

public class P24{
     public static void main(String[] args){
         dance();
}

 public static void dance(){
   System.out.println("Give me 20 RS I wiil dance");
 }
}
