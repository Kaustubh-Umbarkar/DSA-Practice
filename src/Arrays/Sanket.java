package Arrays;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;

public class Sanket {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int w1=sc.nextInt();
        int w2=sc.nextInt();
        int w3=sc.nextInt();
        int L=sc.nextInt();
        int C=sc.nextInt();
        int a=w1+w3;
        int b=w2+w3;
        int c=w1+w2;
        if(a<=L && w2<=C||b<=L && w1<=C||c<=L && w3<=C)
        {
            System.out.println("Yes");
        }
        else
            System.out.println("No");





    }
}
