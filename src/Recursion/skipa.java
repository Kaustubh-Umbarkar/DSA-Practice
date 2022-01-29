package Recursion;

public class skipa {
    public static void main(String[] args) {
String a="abacccd";
        System.out.println(skip(a));;
    }
    public static String skip(String up)
    {
        if(up.isEmpty())
        {

            return "";
        }
        char ch=up.charAt(0);
        if(ch=='a')
        {
            return skip(up.substring(1));
        }
        else
            return ch+skip(up.substring(1));
    }
}
