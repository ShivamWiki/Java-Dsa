import java.util.*;
public class NewFn {
    public static int Plus(int a ,int b) {
    // public static void Plus(int a ,int b) {
    // public static void Plus() {
//         Scanner sc = new Scanner(System.in);
// int a = sc.nextInt();
// int b = sc.nextInt();
int sum =a+b;
return sum;
// System.out.println("Sum is : " + sum);
// sc.close();
    }


public static void main(String args []) {

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

   int sum = Plus(a,b);
    // Plus(a,b);

     System.out.println("Sum is : " + sum);
    sc.close();
}



}
