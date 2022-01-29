package Greedy;

import java.util.*;

public class Activity {
    public static void main(String[] args) {
        Map<Integer,Integer> has=new HashMap<Integer,Integer>();
has.put(12,25);
has.put(10,20);
has.put(20,30);
        List<Map.Entry<Integer, Integer> > list =
                new LinkedList<Map.Entry<Integer, Integer> >(has.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }

        });
        System.out.println(list);

    }

    /*public static int activity(List<List<Integer>> list)
    {
        int n=list.size();
        int prev=0;
        int res=0;
        for(int cur=1;cur<=n;cur++)
        {

        }

    }*/
}
