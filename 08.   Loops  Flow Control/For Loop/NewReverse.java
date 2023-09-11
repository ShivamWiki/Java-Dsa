import  java.util.*;
public class NewReverse {
    public static void main(String args []) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a Number = ");
      int Num = sc.nextInt();
      System.out.print("Reverse of a Number = ");
      int rev = 0;

      for(;Num>0;){
        int Last = Num % 10;
        rev =( rev*10)+Last;
        Num = Num / 10;
      
        
      }
      System.out.println(rev+" ");
      

      
    }
    // sc.close();  
}
