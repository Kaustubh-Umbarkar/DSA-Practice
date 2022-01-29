package Recursion;

public class removeDupl {
    static boolean[] arr=new boolean[26];
    public static void main(String[] args) {
        String s="aabbccdd";
       remove1("",s);
    }
    public static void remove1(String p,String up)
    {
        if (up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        if(arr[ch-'a'])
        {
            remove1(p,up.substring(1));
        }
        else
        {
            arr[ch-'a']=true;
            remove1(p+ch,up.substring(1));

        }
    }
}
