package Infosys;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MaxOccurence {
    public static void main(String[] args) {
String s="testsample";
//maxOcc(s);
        Character c=getMaxOccurringChar(s);
        System.out.println(c);
    }
    public static void maxOcc(String str)
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
        int max=0;
        char x='0';
        for(Map.Entry<Character,Integer> e:has.entrySet())

        {
            if(e.getValue()==max)

            if(e.getValue()>max)
            {
                max=e.getValue();
                x= e.getKey();
            }


        }
        System.out.println(x);

    }
    static char getMaxOccurringChar(String str) {
        // freq[] used as hash table
        int freq[] = new int[26];

        // to store maximum frequency
        int max = -1;

        // to store the maximum occurring character
        char result = 0;

        // length of 'str'
        int len = str.length();

        // get frequency of each character of 'str'
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) != ' ') {
                freq[str.charAt(i) - 'a']++;
            }
        }
        System.out.println(Arrays.toString(freq));

        // for each character, where character is obtained by
        // (i + 'a') check whether it is the maximum character
        // so far and accodingly update 'result'
        for (int i = 0; i < 26; i++) {
            if (max < freq[i]) {
                max = freq[i];
                result = (char) (i + 'a');
            }
        }

        // maximum occurring character
        return result;
    }
}
