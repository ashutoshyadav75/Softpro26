// 

class Papa{
    public void car(){
         System.out.println("Papa ka Car");
    }
}

class Beta extends Papa{
    public void bike(){
        System.out.println("Beta ka Bike");
    }
}

class Beti extends Papa {
    public void scooty(){
        System.out.println("Beti ki Scooty");
    }
}

public class P16{
    public static void main(String[] args){
        Papa papa  = new Papa();
        papa.car();

        Beta beta = new Beta();
        beta.bike();
        beta.car();

        Beti beti = new Beti();
        beti.scooty();
        beti.car();

    }
}