import java.util.*;

public class Largest4Num {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A = ");
        int a = sc.nextInt();
        System.out.print("Enter B = ");
        int b = sc.nextInt();
        System.out.print("Enter C = ");
        int c = sc.nextInt();
        System.out.print("Enter D = ");
        int d = sc.nextInt();

        if (a > b) {
            if (a > c) {
                if (a > d) {
                    System.out.print("A is Greater = "+a);
                    // System.out.println(a);
                } else {
                    System.out.println("D is Greater = "+d);
                }
            }
        } else if (b > c) {
            if (b > d) {
                System.out.print("B is Greater = "+b);
                
            } else {
                System.out.print("D is Greater = "+d);
              
            }
        } else if (c > d) {
            System.out.print("C is Greater = "+c);
            
        } else {
            System.out.print("D is Greater = "+d);
           

        sc.close();
    }

    }

}








