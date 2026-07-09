class Add{

    int a ;
    int b ;
  public Add(int a , int b){
        this.a = a ;
        this.b = b;
  }

     public void display(){


           System.out.println("a = " + this.a);
           System.out.println("b = " + this.b);
}
}

  public class P10{

       public static void main(String[] args){

         System.out.println("-----Main Method Executing------");
           Add add = new Add( 4 ,5);
             add.display();
}
}