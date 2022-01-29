package Maze;

public class Mazediag {
    public static void main(String[] args) {
        mazepathdiag("",3,3);
    }
    public static void mazepathdiag(String p,int r,int c)
    {

        if(r==1 && c==1)
        {
            System.out.println(p);
            return;
        }
        if(r>1 && c>1)
        {
            mazepathdiag(p+"D",r-1,c-1);
        }
        if (r>1)
        {
            mazepathdiag(p+"V",r-1,c);
        }
        if (c>1)
        {
            mazepathdiag(p+"H",r,c-1);
        }
    }
}
