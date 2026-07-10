// Multi-level Inheritance

class Dada {
      public void cycle(){
        System.out.println("Dada ki  Cycle");
        }
}

class Papa extends Dada{
    public void scooter(){
        System.out.println("Papa ka Scooter");
    }
}

class Beta extends Papa{
    public void bike(){
        System.out.println("Beta ka Bike");
    }
}

public class P15{
      public static void main(String[] args){
        System.out.println("---Main Method Executing-----");
        Dada dada = new Dada();
        Papa papa = new Papa();
        Beta beta = new Beta();

          beta.cycle();

      }
}