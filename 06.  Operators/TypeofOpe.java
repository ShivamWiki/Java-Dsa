import  java.util.*;

public class TypeofOpe {
    public static void main(String  args[]) {
        Scanner sc = new Scanner(System.in);
  

        //   ||   Types of operator in java  ||       //

        // Arithmetic Operator // -- // Binary || Unary //
        // Relational Operator // -       ( + ) ( ++ )
        // Logical Operator //            ( - ) ( +- )
        // bitwise Operator //            ( * )
        // Assingnment Operator //        ( / )
        //                     //         ( % )


        //  ++a =  Pre increment   ||  --a =  Pre Decrement   ||
        //  a++ =  Post increment  ||  a-- =  Post Decrement 
    //     System.out.println("Enter A number  ");
    //    int a = sc.nextInt();
    //    int  b = ++a;     // Pre increment //
    //    System.out.println(a);
    //    System.out.println(b);
    

    // Unary Operator //
       System.out.println("Enter A number  ");
       int a = sc.nextInt();
       int  b = a++;     // Post increment //
      
       System.out.println(b);
       System.out.println(a);
       a++;
       System.out.println(a);

       sc.close(); 
    }
}
