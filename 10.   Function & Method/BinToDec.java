import java.util.*;

public class BinToDec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Binary Num = ");
        int Bin = sc.nextInt();
        BinT(Bin);
        sc.close();
    }

    public static void BinT(int Bin) {
        int Dec = 0;
        int Pow = 0;
        while (Bin > 0) {
            int Last = Bin % 10;
            Dec += Last * Math.pow(2, Pow);
            Bin /= 10;
            Pow++;
        }
        System.out.print("Decimal Num = "+Dec);
    }
}