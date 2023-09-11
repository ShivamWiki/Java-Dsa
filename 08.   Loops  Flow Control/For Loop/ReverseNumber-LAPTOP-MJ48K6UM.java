import java.util.*;
public class ReverseNumber {
    public static void main(String args[]) {
        Scanner sc= new Scanner (System.in);
        System.out.print("Enter a Number = ");
        int Num = sc.nextInt();
        System.out.print("Reverse Of Number = ");
       
        // while(Num>0){
        //     int Last_Digit = Num %10; 
        //     Num = Num/10;
            
        //     System.out.print(Last_Digit);
           
        // }
        
        // int Last_Digit = 0;
        for(;Num>0;){
            int Last_Digit = Num %10; 
            Num = Num/10;

            System.out.print(Last_Digit);
           
           
        }
        

        //     int i =  Num;
        // do{
        //     int Last_Digit = Num %10; 
        //         Num = Num/10;
        //     System.out.print(Last_Digit); 
        //     i=i-1;
        // }
        // while(Num>0);
       
        
        

sc.close(); 

    }
}
