public  Add
     {

    int a;
    int b;
    public void setAB(int a , int b ){
          this.a = a;
          this.b = b;
  
}

    public void result()
{
      int res;
     System.out.println("Result:" + res);
}
        
}


public class P6{
        public static void main(String[] args){
          System.out.println("------Main Method Exexcuting-------");
         Add  cal = new Add();
          cal.setAB(4 , 5);
         cal.result();


}

}