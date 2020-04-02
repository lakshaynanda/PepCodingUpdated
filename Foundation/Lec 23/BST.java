import java.util.*;

public class BST
{
    static class node
    {
        int data;
        node left;
        node right;
        node (int d){
            this.data=d;
        }
    }
    public static node construct(int[] data,int lo,int hi)
    {
        if(lo>hi)
        {
            return null;
        }
        else if(lo==hi)
        {
            return new node(data[hi]);
        }
        int mid=(lo+hi)/2;
        node croot=new node(data[mid]);
        croot.left=construct(data,lo,mid-1);
        croot.right=construct(data, mid+1, hi);
        return croot;
    }
    public static void display(node croot)
    {
        if(croot==null)
        {
            return;
        }
        System.out.print(croot.data+"->");
        if(croot.left != null)
        {
            System.out.print(croot.left.data+",");
        }
        if(croot.right != null)
        {
            System.out.print(croot.right.data+",");
        }
        System.out.println(".");
        if(croot.left != null)
        {
            display(croot.left);
        }
        if(croot.right != null)
        {
            display(croot.right);
        }
    }
    public static node lca(node root,int a,int b)
    {
        if(root.data==a||root.data==b||a<root.data && b>root.data)
        {
            return root;
        }
        else if(a<root.data && b<root.data)
        {
            return lca(root.left,a,b);
        }
        else
        {
            return lca(root.right,a,b);
        }
    }
    public static int sumInRange(node root,int lo,int hi)
    {
        int mySum=0;

        
        return mySum;
    }
    public static void main(String args[])
    {
        int data[]={10,20,30,40,50,60,70,80,90,100,110};
        node rt=construct(data,0,data.length-1);
        node root=lca(rt, 80, 110);
        System.out.println(root.data);
        // display(rt);
    }
}