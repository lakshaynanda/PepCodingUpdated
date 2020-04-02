import java.io.*;
import java.util.*;

public class ceil{

public static void main(String[] args) throws Exception {
    Scanner sc=new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++)
    {
       arr[i] = sc.nextInt();
    }
    int data = sc.nextInt();
    int left = 0;
    int right = arr.length - 1;
    int ceil = 0;
    int floor =  0;
    while(left <= right){
       int mid = (left + right) / 2;
       if(data > arr[mid]){
         left = mid + 1;
         floor = arr[mid];
       } else if(data < arr[mid]){
         right = mid - 1;
         ceil = arr[mid];
       } else  {
         floor = arr[mid];
         ceil = arr[mid];
         break;
       }
    }

    System.out.println(ceil); 
    System.out.println(floor);
 }

}