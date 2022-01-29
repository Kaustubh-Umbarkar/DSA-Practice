package Recursion;

public class StrRev {
    public static void main(String[] args) {

        String s="abcd";
        reverse(s);
    }
    public  static void reverse(String s)
    {
        if(s.isEmpty())
        {
            System.out.println(s);
            return;
        }
        System.out.print(s.charAt(s.length()-1));
        reverse(s.substring(0,s.length()-1));

    }
}
