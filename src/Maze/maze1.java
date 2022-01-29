package Maze;

public class maze1 {
    public static void main(String[] args) {
        mazepath("",3,3);
    }
    public static void mazepath(String p,int r,int c)
    {
        if(r==1 && c==1)
        {
            System.out.println(p);
            return;
        }
        if (r>1)
        {
            mazepath(p+"D",r-1,c);
        }
        if (c>1)
        {
            mazepath(p+"R",r,c-1);
        }
    }
}
