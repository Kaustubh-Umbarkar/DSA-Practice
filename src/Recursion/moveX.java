package Recursion;

public class moveX {
    public static void main(String[] args) {

        String s="abxxcd";
        remvoveX("",s,0);
    }
    public static void remvoveX(String p,String up,int cnt)
    {

        if(up.isEmpty())
        {
            for(int i=0;i<=cnt;i++)
            {
                p+='x';
                i++;
            }

            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        if(ch=='x')
        {
            cnt++;
            remvoveX(p,up.substring(1),cnt);

        }
        else
        {
            remvoveX(p+ch,up.substring(1),cnt);

        }

    }
}
