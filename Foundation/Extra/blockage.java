import java.util.*;
public class blockage
{
    public static int floodFill(int[][] arr,int i,int j,String psf)
    {
        if(i==arr.length-1 && i==arr[0].length-1)
        {
            System.out.println(psf);
            return 1;
        }
        arr[i][j]=1;
        int count=0;
        if(i-1>=0 && arr[i-1][j]!=1)
        {
            count+=floodFill(arr,i-1,j,psf+'U');
        }
        if(j-1>=0 && arr[i][j-1]!=1)
        {
            count+=floodFill(arr,i,j-1,psf+'L');
        }
        if(i+1>=0 && arr[i+1][j]!=1)
        {
            count+=floodFill(arr,i+1,j,psf+'D');
        }
        if(j+1>=0 && arr[i][j+1]!=1)
        {
            count+=floodFill(arr,i,j+1,psf+'R');
        }
        arr[i][j]=0;
        return count;
    }
    public static void main(String args[])
    {
        floodFill
    }
}