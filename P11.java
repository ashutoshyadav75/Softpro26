  class Test{

      public Test(){
          System.out.println("This 1 Signature");
      }

      public Test(int a ){
        System.out.println("This 2 Signature" + a );
      }

      public Test(int a, int b){
        System.out.println("This 3 Signature of a " +  a + " and b" + b);
      }
  }
      public class P11{
        public static void main(String[] args){
          System.out.println("------Main Method Exexcuting-------");
          new Test();
          new Test(10);
          new Test(10, 20);
        }
      }