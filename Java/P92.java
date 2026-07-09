


import java.util.Scanner;

import java.util.Arrays;
public class P92{
       public static void main(String[] args){
              Scanner sc = new Scanner(System.in);
    System.out.println("Enter the no. of element:");
            int n = sc.nextInt();
              int[] arr = new int[n];
            int sum = 0;
                  Arrays arr; 
      
           System.out.println("==Insering the data in Element==");
              for(int i = 0 ; i<arr.length ; i++){
                      System.out.print("Enter" + i + "the Element:" );
                                       arr[i] = sc.nextInt();
                                          sum = sum + arr[i];
}
                
                    System.out.println("Array:" +arr);
                        System.out.println("Array:" + Arrays.toString(arr));
}
}