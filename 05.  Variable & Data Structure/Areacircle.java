import java.util.*;
public class Areacircle {
    public static void main(String args[]) {
        
        Scanner sc =new Scanner(System.in);
       

      System.out.print("Enter Radius ");
      // Decimel value Enter by user //

        float  num =sc.nextFloat();

        float radius = 3.14f * num * num;

        //    float radius = 22/7f * num * num;

           float perimeter = 2 * 3.14f * num;
        System.out.print("Area Of A Circle ");
        System.out.println(radius);

        System.out.print("Perimeter Of A Circle ");
        System.out.println(perimeter);

        sc.close();

    }
}
