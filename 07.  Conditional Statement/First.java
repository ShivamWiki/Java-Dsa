import java.util.*;

public class First {
    public static void main(String args[]) {


        Scanner sc = new Scanner(System.in);


   System.out.print(" Enter Age  ");
int a= sc.nextInt();
int m =0;

// for(int i=1; i<=10; i=i+1){

//     System.out.println(i*a);
// }
for(int i=2; i<a; i=i+1){

    if(a%i==0){
        // System.out.println("Heee");
        m=1;
        break;
        
    }

}
if(m==0){
    System.out.println("prime");
}
else{
    System.out.println("Com");
}
// if(a>19){
//     System.out.println("You R vote");
// }
// else if(a>15){
//     System.out.println("You R minor");

// }
// else{
//     System.out.println("you R child");
// }
// // int = sc.nextInt();














sc.close();
    }
}
