import java.util.Scanner;

public class CallValue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Arr[] = { 1, 5, 7 };
        System.out.println("Before Function Call = ");
        for (int i = 0; i < Arr.length; i++) {
            System.out.print(Arr[i] + " ");
        }
        System.out.println(" ");
        Value(Arr);
        sc.close();
    }

    public static void Value(int Arr[]) {
        Arr[2] = 15;
        System.out.println("After Function Call = ");
        for (int i = 0; i < Arr.length; i++) {
            System.out.print(Arr[i] + " ");
        }
        System.out.println(" ");
    }

}
