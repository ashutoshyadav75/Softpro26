


import java.util.Scanner;
public class P90{
       public static void main(String[] args){
                   Scanner sc = new Scanner(System.in);
    System.out.println("Enter the no. of element:");
            int n = sc.nextInt();
              int[] arr = new int[n];
            int sum = 0;
      
           System.out.println("==Insering the data in Element==");
              for(int i = 0 ; i<arr.length ; i++){
                      System.out.print("Enter" + i + "the Element:" );
                                       arr[i] = sc.nextInt();
}

                     for(int ele: arr){
                     System.out.println("Element:" +ele);
}
                    System.out.println("==Sum of Element==");

                               for(int item: arr){
                                   sum = sum + item;
                   
}        
                        System.out.println("Sum:" +sum);
                                   System.out.println("Average:" +(sum/arr.length));
}

}