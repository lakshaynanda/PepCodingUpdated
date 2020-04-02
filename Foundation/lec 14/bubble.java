import java.util.*;
public class bubble
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
        int end=arr.length;
        for(int k=0;k<end;k++)
        {
            for(int j=1;j<end-k;j++)
            {
                if(arr[j-1]>arr[j])
                {
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
                
            }
        }

        for(int m=0;m<arr.length;m++)
        {
            System.out.print(arr[m]+" ");
        }System.out.println();
    }
}