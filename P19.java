// How to typecast anything in object
// To proof that datatype inherit from the datatype



  public class P19{
        public static void main(String[] args){
              int a = 10;
 float b = 10.5f;
 boolean c = true;
 char d = 'A';
double e = 2.345654;
//-------------------------------------------------------------------------------------------------------------
// Primitive data types inherit that scope from wrapper class
System.out.println("=====================================================Wrapper Class===============================================================================================");
System.out.println(((Object)a).getClass());  
System.out.println(((Object)b).getClass());  
System.out.println(((Object)c).getClass());
System.out.println(((Object)d).getClass());
System.out.println(((Object)e).getClass());


//-----------------------------------------------------------------------------------------------------------
// type : .getSimpleName()
System.out.println("=====================================================Wrapper Class===============================================================================================");

System.out.println(((Object)a).getClass().getSimpleName());  
System.out.println(((Object)b).getClass().getSimpleName());  
System.out.println(((Object)c).getClass().getSimpleName());
System.out.println(((Object)d).getClass().getSimpleName());
System.out.println(((Object)e).getClass().getSimpleName());
}

}