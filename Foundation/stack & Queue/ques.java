import java.util.*;
public class ques {
    public static boolean isBalance(String str)
    {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch=='(' || ch=='[' || ch=='{')
            {
                st.push(ch);
            }
            else
            {
                if(st.size()==0)
                {
                    return false;
                }
                else if(st.peek()=='(' && ch!=')')
                {
                    return false;
                }
                else if(st.peek()=='[' && ch!=']')
                {
                    return false;
                }
                else if(st.peek()=='{' && ch!='}')
                {
                    return false;
                }
                else
                {
                    st.pop();
                }
            }
        }
        return st.size()==0?true:false;
    }
    public static int[] nextGreaterOnRight(int[] arr)
    {
        Stack<Integer> st=new Stack<>();
        int []ans=new int[arr.length];
        // Arrays.fill(ans, arr.length);
        for(int i=0;i<arr.length;i++)
        {
            while(st.size()!=0 && arr[st.peek()]<arr[i])
            {
                int idx=st.pop();
                ans[idx]=i;
            }
            st.push(i);
        }
    while(st.size()!=0)
    {
        int idx=st.pop();
        ans[idx]=arr.length;
    }   
    }
    public static int largestRectangle(int[] heights)
    {
        int[] ngol=nextSmal
    }
    public static void nextGreatest(int[] input)
    {
        Stack<Integer> st=new Stack<>();
        int size=input.length;
        st.push(input[0]);
        for(int i=0;i<size;i++)
        {
            while(!st.isEmpty() && st.peek()<input[i])
            {
                System.out.println(st.pop()+" -> "+input[i]);
            }
            st.push(input[i]);
        }
        while(!st.isEmpty())
        {
            int top=(int)st.pop();
            System.out.println(top+" -> "+null);
        }
    }
    public static void main(String args[])
    {
        int[] input = { 98, 23, 54, 12, 20, 7, 27 };
        nextGreatest(input);
    }
}