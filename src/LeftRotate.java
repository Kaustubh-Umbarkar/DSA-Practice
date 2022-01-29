import java.util.Arrays;

public class LeftRotate {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int[]ans=leftR(arr,3);
        System.out.println(Arrays.toString(ans));

    }
    public static int[] leftR(int[] arr,int d)
    {
        int[] ans=new int[arr.length];
        int k=0;
        int rotIndex=d;
        while(rotIndex<arr.length)
        {
            ans[k]=arr[rotIndex];
            rotIndex++;
            k++;
        }
        rotIndex=0;
        while (rotIndex<d)
        {
            ans[k]=arr[rotIndex];
            rotIndex++;
            k++;
        }
        return ans;
    }
}
