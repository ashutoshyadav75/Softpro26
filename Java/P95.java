import java.util.*;
public class P95{
     public static void main(String[] args){
                    int[] arr = new int[4];
                   int item = 10;
                  System.out.println("Array:" + Arrays.toString(arr));
                   Arrays.fill(arr , item);
                  System.out.println("Array after filling:" + Arrays.toString(arr));
            int[] naya_arr = Arrays.copyOf(arr , arr.length);
  System.out.println("Naya Array after  copy: " + Arrays.toString(arr));
                    System.out.println(Arrays.equals(arr , naya_arr));
         }
}
     