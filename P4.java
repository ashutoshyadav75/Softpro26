class TV {
      String brand = "Sony";
      String type = "oled"; 
       int price = 45;
      int size = 65;

    public static void on(){
    System.out.println(".....Tv is on....");
    System.out.println("...............Sony.............");
}

public static void off(){
    System.out.println("..............Tv is off.............");
}
}

   public class P4{
       public static void main(String[] args){
  System.out.println(".....Main method is running....");
             (new TV()).on();   // Anonymous
      


         //Invalid
       TV.on();
        TV.off();
    
}
}
