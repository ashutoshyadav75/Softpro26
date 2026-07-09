
import java.util.*;
public class P93{
     public static void main(String[] args){
      int[] arr = {10 , 20 , 30 , 40 ,50 , 60 , 70};
     int key = 50;
      int index = Arrays.binarySearch(arr , key);
      System.out.println("Array : " + Arrays.toString(arr));
             if(index>0){
      System.out.println("Element found in location index: " +index);
                }
          else{
               System.out.println("Element not  found in location index");
}
   }
}
     