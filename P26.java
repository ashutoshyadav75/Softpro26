/*
 ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

Concepts Of Getter and Setter fn:-
===================================
setter fn:-
  if a fn is used to set any value to a variable , it is called as setter fn.
 For setter fn  : we use with argument and No return type case. 

getter fn:-
  if a fn is used to get any value to a variable , it is called as getter fn.
 For getter fn  : we use with argument and No return type case. 

*/


public class P26{
       static int a;
       static int b;
        public static void main(String[] args){
           System.out.println("Value of a = " +a + "Value of b ="+b);
          System.out.println("=================Setting the value===========");

      setA(10);
      setB(20);
  System.out.println("================Getting the value===========");
   int result = getResult();
     System.out.println("Result:" + result);
}

public static void setA(int x){
      a =x ;
}
public static void setB(int y){
      b =y ;
}

public static int getResult(){
      return a+b;
}

}



      