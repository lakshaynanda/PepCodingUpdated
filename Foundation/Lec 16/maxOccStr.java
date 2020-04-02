import java.util.*;
public class maxOccStr
{
    public static void maxOcc(String str)
    {
        char arr[]=str.toCharArray();
        Arrays.sort(arr);
        int [] fr = new int [arr.length];  
        int visited = -1;  
        for(int i=0; i<arr.length; i++){  
            int count = 1;  
            for(int j=i+1;j< arr.length;j++){  
                if(arr[i] == arr[j])
                {  
                    count++;  
                    fr[j] = visited;  
                }  
            }  
            if(fr[i] != visited)  
                fr[i] = count; 
            
        }
        int max=0;
            for(int i=0;i<fr.length;i++)
            {
                if(fr[i]!=visited && fr[i]>max)
                {
                    max=fr[i];
                }
            }System.out.println(max);   
    }
    
    public static void main(String args[])
    {
        String str="abcadagfxyaaxaz";
        maxOcc(str);
    }
}