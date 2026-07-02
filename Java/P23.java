 

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
public class P23{
      public static void main(String[] args){
         int number = getRandom(1000,9999);
          System.out.println("Number:" + number);
}


// Functional Approach
public static int getRandom(int min, int max){
    double r = (Math.random() -1 );
    int range= (int)(r*(max-min) + max);
   return range;
}
}

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------