import java.util.*;

public class Condi {
    public static void main(String args[]) {


        Scanner sc = new Scanner(System.in);


   System.out.print(" Enter Age  ");
int a= sc.nextInt();

if(a>=18){
    System.out.println("You R vote");
}
else if(a>15 && a<18){
    System.out.println("You R minor");

}
else{
    System.out.println("you R child");
}
// int = sc.nextInt();














sc.close();
    }
}
