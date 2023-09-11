import java.util.*;

public class Arraymax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = Integer.MIN_VALUE;
        System.out.println("Enter Array Element = ");
        int Arr[] = new int[4];
        for (int i = 0; i < Arr.length; i++) {
            Arr[i] = sc.nextInt();
        }

        for (int i = 0; i < Arr.length; i++) {

            if (S < Arr[i]) {
                S = Arr[i];
            }
        }
        System.out.println("Largest Element = " + S);
        sc.close();
    }
}
