package Recursion;

import java.util.HashSet;

public class UniqueSubseq {
    public static void main(String[] args) {
        String s="aaa";
        HashSet<String> set=new HashSet<>();
        uniquesub("",s,set);
    }
    public static void uniquesub(String p, String up, HashSet<String> set)
    {
        if (up.isEmpty())
        {
            if (set.contains(p))
            {
                return;
            }
            else
            {
                set.add(p);
                System.out.println(p);
                return;
            }
        }
        char ch=up.charAt(0);
        uniquesub(p+ch,up.substring(1),set);
        uniquesub(p,up.substring(1),set);
    }
}
