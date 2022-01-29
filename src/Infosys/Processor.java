package Infosys;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Processor {
    public static void main(String[] args) {
        ArrayList<Integer> pr=new ArrayList<>();
        pr.add(8);
        pr.add(10);
        ArrayList<Integer> time=new ArrayList<>();
        time.add(3);
        time.add(1);
        time.add(8);
        time.add(7);
        time.add(4);
        time.add(2);
        time.add(5);
        time.add(2);
        Collections.sort(pr);
        Collections.sort(time,Collections.reverseOrder());
int k=0;
        int[] arr=new int[time.size()];
        for(int i=0;i<pr.size();i++)
        {
            for(int j=0;j<4;j++)
            {
                arr[k]=pr.get(i)+time.get(k);
                k++;
            }
        }
int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
                max=arr[i];
        }
        System.out.println(max);

    }
}
