class Test{

    public void display(){
      System.out.printl("Inside class:" + this);
}


public class P7{
           public static void main(String[] args){
           System.out.printl("------Main Method Executing ------");
          Test test = new Test();
          test.display();
   System.out.printl("Outside class :" + test);

}

}