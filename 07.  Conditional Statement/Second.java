import java.util.*;
public class Second {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);

      int a=sc.nextInt();

     for(int i=1; i<=a; i=i+1){

     if(i%2==0){
      System.out.println(i+" Even Num ");
  
     }

  else{
   System.out.println(i+" Odd Num ");
     
      // System.out.print(i);
}

     }





      sc.close();
      
   }   

}
