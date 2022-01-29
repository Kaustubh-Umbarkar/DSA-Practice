package Recursion;

public class skipApple {
    public static void main(String[] args) {
        String a="KaustubhNitinUmbarkar";
        String rem="Nitin";
        System.out.println(skip(a,rem));

    }
    public static String skip(String up,String remove)
    {
        if(up.isEmpty())
        {

            return "";
        }

        if(up.startsWith(remove))
        {
            return skip(up.substring(remove.length()),remove);
        }
        else
            return up.charAt(0)+skip(up.substring(1),remove);
    }
}
