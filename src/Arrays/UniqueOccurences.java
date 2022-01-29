package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class UniqueOccurences {
    public static void main(String[] args) {
        int[] arr={1,2,2,1,1,3};
        ArrayList<Integer>ans=new ArrayList<>();
        int cnt=1;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i+=cnt)
        {
            cnt=1;
            for(int k=i+1;k<arr.length;k++)
            {
                if(arr[i]==arr[k])
                {
                    cnt++;
                }

            }
            ans.add(cnt);


        }
        System.out.println(arr[0]+ans.get(0));
        //System.out.print(Arrays.toString(ans));
    }
}
