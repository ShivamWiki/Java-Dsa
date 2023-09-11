import java.util.*;
public class HelloWorld {
    public static void main(String args []) {
        Scanner sc = new  Scanner (System.in);
        System.out.println("Hello World !!");
        int m = sc.nextInt();

          for(int i = 1; i<=m; i++){
            System.out.println(i+" Code Dot");
          }



        sc.close();
    }

}
