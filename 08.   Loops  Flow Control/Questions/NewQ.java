

import java.util.*;
public class NewQ {
    
    public static void main(String []args) {
        Scanner sc = new Scanner (System.in);
        System.out.print(" Enter a Number = ");
              int a=sc.nextInt();
               int m=0;
              for(int i =2; i<a; i=i+1){
                if(a%i==0){
                   
                  m=1;
                  break;

                }
              }
              if(m==0){
                System.out.println(a+" is a Prime Number ");
              }
              else{
                System.out.println(a+" is a Composite Number ");
              }







        sc.close();
    }
}
