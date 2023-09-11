import java.util.*;
public class LettPtn {
   public static void main(String args[]) {
    Scanner sc = new Scanner (System.in);
    System.out.print("Enter A Number = ");
    int n =sc.nextInt();
    char ch = 'A' ;
     char c='a';


     
     if(n<=26){
      for(int i=1; i<=n; i++){
     
        System.out.print(i+"-"+ch+"  ");
        ch++;
      }
      System.out.println(" ");
      System.out.println(" ");
      

      for(int i=1; i<=n; i++){
     
        System.out.print(i+"-"+c+"  ");
        c++;
      
      
      }
    }
 
    else {
      System.out.print("Sorry ");
    }

      sc.close();
    }
  }


