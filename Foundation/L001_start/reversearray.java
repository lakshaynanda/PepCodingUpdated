import java.util.*;
public class reversearray
{
	public static void main(String args[])
	{
		//Scanner sc = new Scanner(System.in);
		//int size= sc.nextInt();
		int arr[] = {1,2,3,4,5};

		int i=0;
		int j=arr.length-1;
			while(i<j)
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
			}
		
		for(int m=0;m<arr.length;m++)
		{
			System.out.println(arr[m]);
		}
	}
}