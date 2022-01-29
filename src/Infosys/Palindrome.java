package Infosys;

public class Palindrome {
    public static void main(String[] args) {
        String a="abcda";
        boolean x=isPalindrome(a);
        System.out.println(x);

    }
    public static boolean isPalindrome(String a)
    {
        int s=0;
        int e=a.length()-1;
        while(s<=e)
        {
            if(a.charAt(s++)!=a.charAt(e--))
                return false;
        }
        return true;
    }
}
