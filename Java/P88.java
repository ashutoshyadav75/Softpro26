// WAP in java to make default Array 
// 

public class P88{
       public static void main(String[] args){
              int[] arr = new int[4];
               char[] ch = new char[4];
               String[] st = new String[4];
           System.out.println("=================For each loops of int===================");
             for(int ele:arr){
  System.out.println("Element:" +ele);
}

           System.out.println("=================For each loops of Char===================");
             for(char ele1:ch){
  System.out.println("Element:" +ele1);
}


           System.out.println("=================For each loops of String===================");
             for(String ele2:st){
  System.out.println("Element:" +ele2);
}

}
}