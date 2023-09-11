import java.util.*;

public class PrimeCom {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Num - ");
        int a = sc.nextInt();
        int b = 0;

        // for(int i=2; i<a; i=i+1){
        // if(a%i==0){
        // b=1;
        // }
        // }

        int i = 2;
        while (i < a) {
            if (a % i == 0) {

                b = 1;
            }
            i = i + 1;
        }
        if (b == 1) {
            System.out.println(a + " is a Composite Number");
        } else {
            System.out.println(a + " is a Prime Number");
        }

        sc.close();
    }
}
