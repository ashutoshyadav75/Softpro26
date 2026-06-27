/*  Dijikastra Algorithm of random Range

 let r be random factor , and min and max are range of numbers 
min = 1000
max = 9999
range = r*diff of max/min + max (range = r*(max-min) +max)
r = Math.random()


range = Math.random()*(max-min)

*/


public class P22{
     public static void main(String[] args){
             int min = 1000;
              int max = 9999;
               int r = (int)(Math.random()* 9999);
 System.out.println("Value of r: " + r);
}
}