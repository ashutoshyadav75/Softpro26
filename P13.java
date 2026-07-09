//Has-a-relationship


class Pranjal {


   public void pass(){
        System.out.println("Pass the Exam");
}


}


class Alia{



   public void pass(){
        System.out.println("Cannot pass the Exam");
}
   public Pranjal makeboyfriend(){
             return new Pranjal();
}


}


public class P13{
       public static void main(String[] args){
        Pranjal pj = new Pranjal();
           pj.pass();
       Alia al = new Alia();
           al.pass();
         al.makeboyfriend().pass();


}

}
