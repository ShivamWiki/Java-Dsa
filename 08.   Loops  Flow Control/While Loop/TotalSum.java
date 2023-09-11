import java.util.*;

public class TotalSum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Num = ");
        int a = sc.nextInt();
        int sum = 0;

        int i = 0;
        while (i <= a) {
            sum = sum + i;

            i = i + 1;
        }
        System.out.print("Enter a Num = ");
        System.out.println(sum);

        sc.close();
    }
}
