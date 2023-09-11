import java.util.*;

public class PrntSqrPtn {
    public static void main(String args[]) {
         Scanner  sc = new Scanner  (System.in);
System.out.print(" Enter a Number of Pattern = ");
            int ptn =sc.nextInt();
        /*  While Loop 

            int i =1;
            while(i<=ptn){
                System.out.println(i+" = * * * *");
                i++;
            }
            */

            for(int i =1; i<=ptn; i++){
                System.out.println(i+" = * * * *");
            }

        



         sc.close();
        
    }
}
