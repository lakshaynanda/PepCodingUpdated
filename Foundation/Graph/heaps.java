import java.util.*;

public class heaps 
{
    public static ArrayList<Integer> arr=new ArrayList<>();
    public static boolean isMax=false;
    public static void downHeapify(int parIdx,int endInd)
    {
        int maxidx=parIdx;
        int lci=2*parIdx;
        int rci=2*parIdx+2;
        if(lci<=endInd && arr.get(lci)>arr.get(maxidx))
        {
            maxidx=lci;
        }
        if(rci<=endInd && arr.get(rci)>arr.get(maxidx))
        {
            maxidx=rci;
        }
        if(parIdx!=maxidx)
        {
            swap(parIdx, maxidx);
            downHeapify(maxidx, endInd);
        }

    }
    public static void upHeapify(int ci)
    {
        int pi=(ci-1)/2;
        if(pi>=0 && arr.get(ci)>arr.get(pi))
        {
            swap(ci,pi);
            upHeapify(pi);
        }
    }
    public static int top()
    {
        return arr.get(0);
    }
    public static add(int data)
    {
        arr.add(data);
        upHeapify(arr.size()-1);
    }
    public 
    public static void createHeap(int[] dataSet,boolean isMax)
    {
        for(int ele:dataSet)
        {
            arr.add(ele);
        }
        int endInd=arr.size()-1;
        for(int i=endInd;i>=0;i--)
        {
            downHeapify(i, endInd);
        }
    }
    public static void swap(int a,int b)
    {
        int val1=arr.get(a);
        int val2=arr.get(b);

        arr.set(a,val2);
        arr.set(b,val1);
    }
    public static int remove()
    {
        int rv=arr.get(0);
        swap(0,arr.size()-1);
        arr.remove(arr.size()-1);
        downHeapify(0,arr.size()-1);
        return rv;
    }
    public static int get()
    {
        return arr.get(0);
    }
    public static void main(String args[])
    {
        int[] dataSet={6,8,2,-4,18,4,10,9,8,9,16,15,13,11};
        createHeap(dataSet, false);
        int ei=dataSet.length-1;
        while(arr.size()!=0)
        {
            int a=remove();
            dataSet[ei]=a;
            ei--;
            // System.out.println(remove()+" ");
        }
        for(int ele:dataSet)
        {
            System.out.println(ele+" ");
        }
    }
}