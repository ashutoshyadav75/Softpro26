
public class P33{
         public static void main(String[] args){
      cycle(0);
         
   }
   public static void cycle(int counter){
if(counter == 10){
 return;
}else if(counter == 5){
    cycle();
}else{

 System.out.println("Cycle Running:" + counter);
  counter = counter +1;
    cycle(counter);
    
}
}
     public static void cycle(){
     System.out.println("The is cycle without counter");
} 

}
