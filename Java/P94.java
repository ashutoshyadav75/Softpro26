
import java.util.*;
public class P94{
     public static void main(String[] args){
      int[] arr = {10 , 20 , 40 , 30 ,50 , 5 , 70};
                  System.out.println("Unsorted array:" + Arrays.toString(arr));
      Arrays.sort(arr);
                         System.out.println("Sorted array:" + Arrays.toString(arr));
     int key = 50;
      int index = Arrays.binarySearch(arr , key);
      System.out.println("Array : " + Arrays.toString(arr));
             if(index>=0){
      System.out.println("Element found in location index: " +index);
                }
          else{
               System.out.println("Element not  found in location index");
}
   }
}
     