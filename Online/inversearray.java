import java.io.*;
import java.util.*;

public class inversearray{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      System.out.println(val);
    }
    // System.out.println(sb);
  }

  public static int[] inverse(int[] a,int[] inv){
    // write your code here
    for(int i=0;i<a.length;i++)
    {
        int temp=a[i];
        inv[temp]=i;
    }
    return inv;
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }

    int[] inv = new int[n];
    inverse(a,inv);
    display(inv);
 }

}