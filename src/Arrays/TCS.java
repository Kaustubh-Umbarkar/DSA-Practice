package Arrays;

import java.util.Scanner;

public class TCS {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b=sc.nextInt();
        tcs(a,b);

    }
    public static void tcs(int a,int b)
    {int n=0;
        if(a>b)
           n=a;
        else
            n=b;
        for(int i=1;i<n+1;i++)
        {
            if(i%2!=0)
            {
                if (a-i>=0)
                    a-=i;
                else
                    System.out.println("A cannot give");
            }
            else
            {
                if (b-i>=0)
                    b-=i;
                else
                    System.out.println("B cannot give");
            }
        }
        System.out.println("A cannot give");
    }
}
