package Maze;

public class BlockedMaze {
    public static void main(String[] args) {

        boolean[][] maze={
                {true,false,false,false},
                {true,true,false,false},
                {false,true,false,false},
                {true,true,true,true}
        };
        rat("",0,0,maze);
    }
    public static void rat(String p,int r,int c,boolean[][] maze)
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
        if (r<maze.length-1)
        {
            rat(p+"D",r+1,c,maze);
        }
        if (c<maze[0].length-1)
        {
            rat(p+"R",r,c+1,maze);
        }
    }
}
