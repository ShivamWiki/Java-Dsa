import java.util.*;
public class Typcasting {
    public static void main(String args[]) {
  /// inplicit type conversion //

  
  /* int a = 10;
  float b =a;
  System.out.println(b);  */

      Scanner sc = new Scanner(System.in);  
    
//  Narrowing Conversyion // Explicit Type Conversion //

      // float to int //
       float f = sc.nextFloat();
       int b = (int)f;
       System.out.println(b);



       /// char To int //

       char ch='A';
       int k = ch;
       System.out.println(k);


       sc.close();
    }
}
