import java.util.*;
public class floodFill 
{
    static int counter=0;
    public static void floodfill(int sr,int sc,int mat[][],boolean[][] visited,String psf)
    {
        if(sr==mat.length-1 && sc==mat[0].length-1)
        {
            counter++;
            System.out.println(counter+". "+psf+" ");
            return;
        }
        if(isAtWrong(sr, sc, mat)==true || visited[sr][sc]==true)
        {
            return;
        }
        visited[sr][sc]=true;
        floodfill(sr+1, sc, mat,visited, psf+"D");
        floodfill(sr, sc-1, mat,visited, psf+"L");
        floodfill(sr-1, sc, mat,visited, psf+"T");
        floodfill(sr, sc+1, mat,visited, psf+"R");
        visited[sr][sc]=false;
    }
    public static boolean isAtWrong(int sr,int sc,int mat[][])
    {
        if(sc>mat[0].length-1 || sr>mat.length-1)
        {
            return true;
        }
        else if(sc<0 || sr<0)
        {
            return true;
        }else
        {
            return false;
        }
    }
    public static void main(String args[])
    {
        int[][] mat={{1,0,1,1},{1,1,1,1},{1,0,1,1},{1,1,0,1}};
        boolean[][] visited =new boolean[mat.length][mat[0].length];
        floodfill(0, 0, mat, visited, "");
    }
}