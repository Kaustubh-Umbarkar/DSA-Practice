package Sorting;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {

        int[] arr={5,3,7,6,9,2,1};
        bubble(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubble(int[] arr,int r,int c)
    {
        if(r==0)
            return;
        if (c<r)
        {
            if(arr[c]>arr[c+1])
            {
                int temp=arr[c];
                arr[c]=arr[c+1];
                arr[c+1]=temp;
            }
            bubble(arr,r,c+1);

        }
        else
        {
            bubble(arr,r-1,0);
        }
    }
}
