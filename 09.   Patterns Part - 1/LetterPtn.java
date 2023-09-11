import java.util.*;
public class LetterPtn {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
    int n = 6;
    char ch = 'A';

    //Outer Loop 
    for(int i = 1; i<=n; i++){
        // Inner Loop
        for(int j=1; j<=i; j++){
            System.out.print(ch+" ");
            ch++;
        }
        System.out.println();
    }



     sc.close();   
    }
}
