package Arrays;

import java.util.Scanner;

public class New {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int x=0;int y=0; int z=0;
        int r=a;
        if(a>=2)
        {
            x++;

        }
        if(a%8>=1)
        {
            y++;
            x=0;

        }
        if(a>26)
        {
            z=0;
            y=0;
            x+=2;
            a-=16;
        }
        System.out.println(x+" "+y+" "+z);


    }
}
