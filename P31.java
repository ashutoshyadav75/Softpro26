 //  Sequencial  calling with Error stack over flow.

public class P31{
         public static void main(String[] args){
      cycle(0);
   }
   public static void cycle(int counter){
if(counter == 10){
 return;
}else{

 System.out.println("Cycle Running:" + counter);
  counter = counter +1;
    cycle(counter);
}
}
}

