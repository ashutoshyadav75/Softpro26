// Single Inheritence

class Papa{
     public void scooter(){
        System.out.println("Papa Scooter");
     }
}

class Beta extends Parent{
    public void bike(){
        System.out.println("Beta Scooter");
    }
}

public class P14{
      public static void main(String[] args){
        System.out.println("---Main Method Executing-----");
        Papa papa = new Papa();
        Beta beta = new Beta();
          beta.scooter();

      }
}