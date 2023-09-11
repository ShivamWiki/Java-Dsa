import java.util.*;

public class SwitchStatement {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        char a = sc.next().charAt(0);

        switch (a) {
            case 'A', 'E','I' ,'O' , 'U':
                System.out.println(a +" is Vowel");
                break;
            case 'a' , 'e' ,'i','o','u':
                System.out.println(a + " is Vowel");
                break;
            // case 'I', 'i':
            //     System.out.println(a + " is Vowel");
            //     break;
            // case 'O', 'o':
            //     System.out.println(a + " is Vowel");
            //     break;
            // case 'U', 'u':
            //     System.out.println(a + " is Vowel");
            //     break;

            default:
                System.out.println(a + " is Consonant");
        }

        sc.close();
    }
}
