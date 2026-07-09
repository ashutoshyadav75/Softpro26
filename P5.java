class Add(){
    int a ;
    int b;

   // to set the value of a and b
 public void setAB(int x , int y){
     a = x ;
     b = y ;

}

  // total of a and b
   public void total(){
   System.out.print(a+b);
}

public void dispaly(){
    System.out.println("Value of a :" +a);
System.out.println("Value of a :" +b);
}
}

class P5{
   public static void main(String[] args){
     Add add = new Add();
       add.display();
       add.setAB();
       add.total();

}
}