class TV {
      String brand = "Sony";
      String type = "oled"; 
       int price = 45;
      int size = 65;

    public void on(){
    System.out.println(".....Tv is on....");
    System.out.println("...............Sony.............");
}

public void off(){
    System.out.println("..............Tv is off.............");
}
}

   public class P2{
       public static void main(String[] args){
  System.out.println(".....Main method is running....");
             (new TV()).on();   // Anonymous
      
         TV remote = new TV();    //Reference Variable
              remote.off();

   TV remote2 = new TV();
     remote2.on();

    
}
}

