import java.util.*;
public class Ternary {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in); 
    
  int m=sc.nextInt();
  
//    String S=m%2==0?" is Divisible By 2 - True , Even Number":" is Not Divisible By 2 - False , Odd Number";
//    System.out.println(+m + S);

   String S=m>=30?" You R Pass":" You R Fail";
   System.out.println(+m + S);
  
    sc.close();
  }  
}
 