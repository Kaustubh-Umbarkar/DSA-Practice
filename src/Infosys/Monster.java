package Infosys;

import java.util.Scanner;

public class Monster {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        boolean[] ans=new boolean[n];
        int e=sc.nextInt();
        int[] monster=new int[n];
        int[] bonus=new int[n];
        int cnt=0;
        for(int i=0;i<n;i++)
        {
            monster[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            bonus[i]=sc.nextInt();
        }
        int i=0;
        while(i<n)
        {
            if(monster[i]<=e && ans[i]==false)
            {
                e+=bonus[i];
                ans[i]=true;
                i=0;
                cnt++;
            }
            else
                i++;
        }
        System.out.println(cnt);


    }
}
