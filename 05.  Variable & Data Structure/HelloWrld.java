import java.util.*;
public class HelloWrld {
     public static void main(String args []) {
        Scanner sc = new Scanner (System.in);
        
       int a = sc.nextInt();

       for(int i=1;i<=a; i= i+1){
         System.out.println(i+" Hello World !");
       }




        sc.close();
     }
    
}
