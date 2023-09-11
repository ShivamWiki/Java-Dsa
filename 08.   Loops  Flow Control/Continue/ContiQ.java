import java.util.*;

public class ContiQ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
             
        // do {
        //     int num = sc.nextInt();
        //     if (num % 10 == 0) {
        //         continue;
        //     }
        //     System.out.println(num);
        // } while (true);


            // int m = sc.nextInt();
           for(int i=0; i<=1000000000; i=i+1){
            int num = sc.nextInt();
                if (num % 10 == 0) {
                    continue;
                }
                System.out.println(num);

        }

        sc.close(); // Wrong Not Use Infinite Loop this code /////
    }
    // sc.close();
}
 