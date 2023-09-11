
public class Finonacci {
    public static void main(String[] args) {
        int FibNum = 5;

        System.out.println(Fibo(FibNum));
    }

    public static int Fibo(int Num) {
        if (Num == 1 || Num == 0) {
            return Num;
        }
        int Fiboo =  Fibo(Num - 1) + Fibo(Num - 2);
        return Fiboo;
    }
}
