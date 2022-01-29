package Recursion;

public class Tower {
    public static void main(String[] args) {

        String s="a";
        String d="b";
        String h="c";
        int n=4;
        toh(n,s,d,h);
    }
    public static void toh(int n,String s,String d,String h)
    {
        if (n==0)
            return;
        toh(n-1,s,h,d);
        System.out.println(n+"["+s+" -> "+d+"]");
        toh(n-1,h,d,s);
    }
}
