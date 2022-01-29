package Infosys;

import java.util.Scanner;

public class UnqueBirth {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a=0;
        if(n%2==0 && n!=k)
        {
            a=n*k;
        }
        else
        {
            a=n*k-1;
        }

        System.out.println(a);
    }
}
