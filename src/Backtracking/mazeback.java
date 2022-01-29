package Backtracking;

public class mazeback {
    public static void main(String[] args) {

        /* boolean[][] maze={
                {true,false,false,false},
                {true,true,false,false},
                {false,true,false,false},
                {true,true,true,true}*/
        boolean[][] maze={{true,false},
                {true,false}
        };
        int [][] arr=new int[maze.length][maze[0].length];
        mazeupdown("",0,0,maze);
    }
    public static void mazeupdown(String p,int r,int c,boolean[][] maze)
    {

        if(r==maze.length-1 && c==maze[0].length-1)
        {
            System.out.println(p);
            return;
        }
        if(!maze[r][c])
        {
            return;
        }
        maze[r][c]=false;   //mark the arrived space as false
        if (r<maze.length-1)
        {
            mazeupdown(p+"D",r+1,c,maze);
        }
        if (c<maze[0].length-1)
        {
            mazeupdown(p+"R",r,c+1,maze);
        }
        if (r>0)
        {
            mazeupdown(p+"U",r-1,c,maze);
        }
        if (c>0)
        {
            mazeupdown(p+"L",r,c-1,maze);
        }
        maze[r][c]=true;    //while going back that is the functions return back
                            //revert back the changes
    }
}
