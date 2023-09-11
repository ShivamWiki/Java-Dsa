public class Reverse {
    public static void main(String[] args) {
        int Arr[] = { 2, 4, 6, 8, 10 };
        Rev(Arr);
        for (int i = 0; i < Arr.length; i++) {
            System.out.println(Arr[i]);
        }

    }

    public static void Rev(int Arr[]) {
        int St = 0;
        int En = Arr.length;
        while (St <= En) {
            int temp = Arr[En];
            Arr[En] = Arr[St];
            Arr[St] = temp;
            St++;
            En--;

        }

    }
}
