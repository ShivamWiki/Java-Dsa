import java.util.*;
public class TypeCasting {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);  

  /// inplicit type conversion //

  // int to float ( int-4 , float -4)
      /* int a = 10;
      float b =a;
      System.out.println(b);  */

     
//  Narrowing Conversyion // Explicit Type Conversion //

     // float to int //
      
       float f = sc.nextFloat();
       int b = (int)f;
       System.out.println(b);



       /// char To int //

    //    char ch='A';
    //    int k = ch;
    //    System.out.println(k);


    // Int to char ///
    //    int num=97;
    //    char ch=(char)num;
    //    System.out.println(ch);

    // char print integer value // 
        // Type promotion //
    //    char ch='A';
    //    System.out.println((int)(ch));
sc.close();
    }
}
