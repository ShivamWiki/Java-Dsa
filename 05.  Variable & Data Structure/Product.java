import java.util.*;

public class Product {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
     
        System.out.print("First Num = ");
        int a = sc.nextInt();
        System.out.print("Second Num = ");
        int b = sc.nextInt();

        int product = a * b;
        int sum = a + b;
        int substract = a - b;
        int divide = a / b;


        System.out.print("Product = ");
        System.out.println(product);

        System.out.print("Substract = ");
        System.out.println(substract);

        System.out.print("Sum = ");
        System.out.println(sum);

        System.out.print("Divide = ");
        System.out.println(divide);

        sc.close();
    }
}
