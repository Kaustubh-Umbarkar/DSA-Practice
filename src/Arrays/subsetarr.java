package Arrays;

import java.util.ArrayList;

public class subsetarr {
    public static void main(String[] args) {

        int[] arr={1,2,3};
        ArrayList<Integer> num=new ArrayList<>();
        subsetarr(arr,0,num);
    }
    public static void subsetarr(int[] arr,int index,ArrayList<Integer> num)
    {
        if(index==arr.length-1)
        {
            ArrayList<Integer> nums=new ArrayList<>();
            System.out.println(num);
            return;
        }
        ArrayList<Integer> nums=new ArrayList<>(num);
        for (int i = index; i <arr.length ; i++) {
            num.add(arr[i]);
            subsetarr(arr,i+1,num);
            num.remove(num.size()-1);
        }

    }
}
