
import java.util.*;
public class While {
 

     public static void main(String args []) {
        Scanner sc = new Scanner (System.in);
        
       int a = sc.nextInt();

    //    for(int i=1;i<=a; i= i+1){
    //      System.out.println(i+" Hello World !");
    //    }
         int i = 1;
         while(i<=a){
            System.out.println(i+" Hello World !");

            i++;
         }




        sc.close();
     }
    

}
