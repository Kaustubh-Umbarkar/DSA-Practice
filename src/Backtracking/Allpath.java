package Backtracking;

import java.util.Arrays;

public class Allpath {
    public static void main(String[] args) {
        boolean[][] maze={
                {true,false,false,false},
                {true,true,false,false},
                {false,true,false,false},
                {true,true,true,true}
        };
        int [][] arr=new int[maze.length][maze[0].length];
        allpath("",0,0,maze,arr,1);
    }
    public static void allpath(String p,int r,int c,boolean[][] maze,int[][] path,int step)
    {

        if(r==maze.length-1 && c==maze[0].length-1)
        {
            path[r][c]=step;
            for(int[] arr:path)
            {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println();
            System.out.println(p);
            return;
        }
        if(!maze[r][c])
        {
            return;
        }

        maze[r][c]=false;         //mark the arrived space as false
        path[r][c]=step;

        if (r<maze.length-1)
        {
            allpath(p+"D",r+1,c,maze,path,step+1);
        }
        if (c<maze[0].length-1)
        {
            allpath(p+"R",r,c+1,maze,path,step+1);
        }
        if (r>0)
        {
            allpath(p+"U",r-1,c,maze,path,step+1);
        }
        if (c>0)
        {
            allpath(p+"L",r,c-1,maze,path,step+1);
        }
        maze[r][c]=true;    //while going back that is the functions return back
                           //revert back the changes
        path[r][c]=0;
    }
}
