package Infosys;

import java.util.*;

public class FirstNonDuplicate {
    public static void main(String[] args) {

        String str="hackthegame";
        int s=getIndex(str);
        System.out.println(s);

    }
    public static int getIndex(String str)
    {
        HashMap<Character,Integer> has=new HashMap<>();
        for(int i=0;i<str.length();i++)
        {
            if(has.containsKey(str.charAt(i)))
            {
                has.put(str.charAt(i),has.get(str.charAt(i))+1);
            }
            else
                has.put(str.charAt(i),1);
        }
        char u= str.charAt(0);
        boolean fnd=false;
        for(Map.Entry<Character,Integer> e:has.entrySet())
        {
            if(e.getValue()==1)
            {
                u= e.getKey();
                fnd=true;
                break;
            }
        }
        if (fnd)
            return str.indexOf(u)+1;
        else
            return -1;



    }
}
