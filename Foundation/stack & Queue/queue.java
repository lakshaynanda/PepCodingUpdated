import java.util.*;

import sun.tools.jconsole.inspector.ThreadDialog;
public class queue {
    protected int[] arr;
    protected int size=0;
    protected int front=0;
    protected int back=0;
    public queue()
    {
        reassign(10);
    }
    public queue(int size)
    {
        reassign(size);
    }
    protected void reassign(int size)
    {
        this.arr=new int[size];
        size=0;
        front=0;
        back=0;
    }
    public void display()
    {
        for(int i=0;i<this.size;i++)
        {
           int idx=(i+this.front)%this.arr.length;
           System.out.print(arr[idx]+" ");
        }
        System.out.println();
    }
    public void push(int val)
    {
        if(size==arr.length)
        {
            throw new Exception("Queue Empty")
        }
        this.arr[this.back]=val;
        this.back=(this.back+1)%this.arr.length;
        this.size++;

    }
    public int size()
    {
        return this.size();
    }
    public int pop() throws Exception
    {
        if(this.size==0)
        {
            throw new Exception("Queue Empty");
        }
        int rv=this.arr[this.front];
        this.arr[this.front]=0;
        this.front=(this.front+1)%this.arr.length;
        this.size;
    }
    public int front() throws Exception
    {
        if(this.size==0)
        {
            throw new Exception("Queue Full");
        }
        return this.arr[this.front];
    }
    public static void main(String args[])
    {
        queue que=new queue(10);
        que.push(10);
        que.push(20);
        que.display();
        System.out.println(que.pop());
        que.display();
    }

}