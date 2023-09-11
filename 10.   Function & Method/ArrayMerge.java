public class ArrayMerge {
    public static void main(String[] args) {
        int Arr1[] = { 2, 4, 6, 8, 10 };
        int Arr2[] = { 2, 1, 6, 8, 10 };
        int Arr3[] = new int[10];
        for (int i = 0; i < Arr3.length / 2; i++) {
            Arr3[i] = Arr1[i];
            int k = 0;
            for (int j = Arr3.length / 2; j < Arr3.length; j++) {
                Arr3[j] = Arr2[k];
                k++;
            }
        }
        
        for (int i = 0; i < Arr3.length; i++) {
            System.out.print(Arr3[i] + " ");
        }

    }
}
