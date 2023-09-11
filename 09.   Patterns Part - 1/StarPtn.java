import java.util.*;
public class StarPtn {
    public static void main(String args[]) {

Scanner sc = new Scanner(System.in);

             System.out.print(" Enter a Number For Print Pattern = ");
            int a = sc.nextInt();
            //  char ch = 'A';

       


        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" " + j + " ");
            }
            System.out.println();
        }
        
       

        for (int i = a; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" " + j + " ");
            }
            System.out.println();
        }
      
        
       

sc.close();
    }
}