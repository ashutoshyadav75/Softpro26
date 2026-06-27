
public class OTP{
          public static void main(String[] args){
                        int d1 =  (int)(Math.random()*10);
                         int d2 =  (int)(Math.random()*10);
                         int d3 =  (int)(Math.random()*10);
                         int d4 =  (int)(Math.random()*10);
    //============================================================================================================================================
                  String otp = ""+d1+d2+d3+d4;                     

         System.out.println("Your OTP is:"  + otp);     
   //**************************************************************************************************************************************************    


         System.out.println("Generated OTP:"  + d1 + d2 + d3+ d4);     
       
}

}