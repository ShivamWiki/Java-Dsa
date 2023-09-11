import java.util.*;

public class Operatr {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Arithmetic Operator // -- // Binary || Unary //
        // Relational Operator // - ( + ) ( ++ )
        // Logical Operator // ( - ) ( +- )
        // bitwise Operator // ( * )
        // Assingnment Operator // ( / )
        // // ( % )


        //  ++a =  Pre increment   ||  --a =  Pre Decrement   ||
        //  a++ =  Post increment  ||  a-- =  Post Decrement 

        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = a + b;
        int diff = a - b;
        System.out.println(sum);
        System.out.println(diff);

        sc.close();
    }
}
