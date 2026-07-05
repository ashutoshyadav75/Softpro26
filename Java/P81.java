//WAP in java to working with Array

public class P81{
         public static void main(String[] args){
                      /*
                                int[] arr = { 10, 20, 30, 40};
                                     int n = arr.length;
                                      System.out.println("Array size:"  +n);
                    
                                       System.out.println("==================================");
                                       System.out.println("1st Element:"  +arr[0]);
                                        System.out.println("2nd  Element:"  +arr[1]);
                                      System.out.println("3rd Element:"  +arr[2]);
                                              System.out.println("Dynamic Element:"  + arr[n-1]);
                                   for(int i = 0 ; i<n ; i++){
                                 System.out.println("Array Element:"  +arr[i]);
}

           
                      char[] ch = {'A' , 'B' , 'C' , 'D'  , 'E'};
              
                                    int m = ch.length;
                                      System.out.println("Array size:"  +m);
                  */  /*
                                       System.out.println("==================================");
                                          System.out.println("1st Element:"  +ch[0]);
                                       System.out.println("2nd Element:"  +ch[1]);
                                        System.out.println("3rd  Element:"  +ch[2]);
                                      System.out.println("4th Element:"  +ch[3]);
                                              System.out.println("Dynamic Element:"  + ch[m-1]);
                                   for(int i = 0 ; i<m ; i++){
                                 System.out.println("Array Element:"  +ch[i]);
}*/
                
                              String[] st = {"Ashutosh " , "Khushi" , "Nitin" , "Chandhan"};
                                               int o = st.length;
                                      System.out.println("Array size:"  +o);
                    
                                   /*    System.out.println("==================================");
                                       System.out.println("1st Element:"  +st[0]);
                                        System.out.println("2nd  Element:"  +st[1]);
                                      System.out.println("3rd Element:"  +st[2]);
                                              System.out.println("Dynamic Element:"  + st[o-1]);
                                   for(int i = 0 ; i<o ; i++){
                                 System.out.println("Array Element:"  +st[i]);
}

*/
                             for(int i = o-1 ; i>=0 ; i--){
                                 System.out.println("Array Element:"  +st[i]);
}
}
}