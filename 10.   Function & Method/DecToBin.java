import java.util.*;

public class DecToBin {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Decimal Num = ");

        int Decimal = sc.nextInt();
        BinT(Decimal);
        sc.close();
    }

    public static void BinT(int Decimal) {
        int Binary = 0;
        int Pow = 0;
        while (Decimal > 0) {
            int Last = Decimal % 2;
            Binary += Last * Math.pow(10, Pow);
            Decimal /= 2;
            Pow++;
        }
        System.out.println("Binary Num = " + Binary);
    }

}
