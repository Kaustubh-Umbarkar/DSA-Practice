package Recursion;

import java.util.ArrayList;
import java.util.List;

public class subsetAl {
    public static void main(String[] args) {
int[] nums={1,2,3};
        System.out.println(subsets(nums));
    }
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
generate(0,nums,new ArrayList<Integer>(),list);
return list;


    }
    public static void generate(int index,int[] nums,List<Integer> current,List<List<Integer>> subsets)
    {
        subsets.add(new ArrayList<>(current));
        for (int i = index; i <nums.length ; i++) {
            current.add(nums[i]);
            generate(i+1,nums,current,subsets);
            current.remove(current.size()-1);
        }
    }
}
