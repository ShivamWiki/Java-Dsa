import java.util.*;
public class SwitchCalcu {
    public static void main(String args[]){
Scanner sc =new Scanner(System.in);
System.out.print("Enter First Num = ");
int a = sc.nextInt();
System.out.print("Enter Second Num = ");
int b = sc.nextInt();
System.out.print("Enter Character = + , - ,* , / = ");
char ch = sc.next().charAt(0);


switch(ch){
case '+' :System.out.println("Addition = "+(a+b));
break;
case '-' :System.out.println("Substract = "+(a-b));
break;
case '*' :System.out.println("Multiply = "+(a*b));
break;
case '/' :System.out.println("Divide = "+(a/b));
break;



}








sc.close();
    }

    
    
}
