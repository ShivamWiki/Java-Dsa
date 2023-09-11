import java.util.*;

public class Hello {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i= 1;
        do{
           
            System.out.println(i+" Hello World !!");
            ++i;
        }
       
        while(i<=a);
            
        

     sc.close();
    }

}
