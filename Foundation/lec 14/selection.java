import java.util.*;
public class selection
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int k=0;k<arr.length-1;k++)
        {
            //int index=i;
            for(int j=k+1;j<arr.length;j++)
            {
                if(arr[k]>arr[j])
                {
                    int temp=arr[j];
                    arr[j]=arr[k];
                    arr[k]=temp;
                }
            }
        }
        for(int m=0;m<arr.length;m++)
        {
            System.out.print(arr[m]+" ");
        }System.out.println();
    }
}