package Greedy;

import java.util.Arrays;
import java.util.Collections;

public class Coins {
    public static void main(String[] args) {
int[] arr={2,5,1,10};
int t=57;
        System.out.println(coins(arr,t));

    }
    public static int coins(int[] arr,int target)
    {
        Arrays.sort(arr);
        for(int i=0;i<arr.length/2;i++) {
            int swap = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = swap;
        }

        int res=0;
        int n=arr.length;
        for (int i=0;i<n;i++)
        {
            if(arr[i]<=target)
            {
                int c=target/arr[i];
                res=res+c;
                target=target-c*arr[i];
            }
            if(target==0)
                break;

        }
        return res;
    }
}
