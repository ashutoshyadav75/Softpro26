 // Difference between this and this()
//  In some case the calling of constructor should be the first line of the constructor call.
 class Test{

      public Test(){
 this(10);
          System.out.println("This 1 Signature");
         
      }

      public Test(int a ){
  this(10,20);
        System.out.println("This 2 Signature" + a );
      
      }

      public Test(int a, int b){
        System.out.println("This 3 Signature of a " +  a + " and b" + b);
      }
  }


      public class P12{
        public static void main(String[] args){
          System.out.println("------Main Method Exexcuting-------");
          new Test();
        
        }
      }