import java.util.*;
public class NewBrk {
   public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);


do{
    System.out.print("Enter a Num = ");
int num = sc.nextInt();
  if(num%10==0){
    System.out.println(" Thank You !!");
    break;
    
  }
 
  System.out.println(num);
}while(true);



    sc.close();
   } 
}
