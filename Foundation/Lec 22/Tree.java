import java.util.*;
class Tree
{
    static node root=null;
    static class node
    {
        int data=0;
        ArrayList<node> child;
        node(int d)
        {
            this.data=d;
            this.child=new ArrayList<>();
        }
    }
    public static void construct(int[] data)
    {
        ArrayList<node> stack=new ArrayList<>();
        for(int i=0;i<data.length;i++)
        {
            if(data[i]==-1)
            {
                stack.remove(stack.size()-1);
            }
            else
            {
                if(root==null)
                {
                    node n=new node(data[i]);
                    root=n;
                    stack.add(n);
                }
                else{
                    node cp=stack.get(stack.size()-1);
                    node n=new node(data[i]);
                    cp.child.add(n);
                    stack.add(n);
                }
            }
        }
    }
    public static void display(node croot){
        if(croot==null)
        {
            return;
        }
        System.out.print(croot.data+"->");
        for(int i=0;i<croot.child.size();i++)
        {
            System.out.print(croot.child.get(i).data+" ");
        }
        System.out.println(".");
        for(int i=0;i<croot.child.size();i++)
        {
            display(croot.child.get(i));
        }
    }
    public static int count(node croot)
    {
        if(croot==null)
        {
            return 1;
        }
        int myans=1;
        for(int i=0;i<croot.child.size();i++)
        {
            myans+=count(croot.child.get(i));
        }
        return myans;
    }
    public static int max(node croot)
    {
        if(croot==null)
        {
            return 0;
        }
        int mymax=croot.data;
        for(int i=0;i<croot.child.size();i++)
        {
            int recMax=max(croot.child.get(i));
            if(mymax<recMax)
            {
                mymax=recMax;
            }
        }
        return mymax;
    }
    public static ArrayList<Integer> n2rp(node root,int data)
    {
        if(root==null)
        {
            return null;
        }
        if(root.data==data)
        {
            ArrayList<Integer> myans=new ArrayList<>();
            myans.add(data);
            return myans;
        }
        for(int i=0;i<root.child.size();i++)
        {
            ArrayList<Integer> recAns=n2rp(root.child.get(i), data);
            if(recAns!=null)
            {
                recAns.add(root.data);
                return recAns;
            }
        }
        return null;
    }
    public static int lowestcommonanc(node root,int da1,int da2)
    {
        ArrayList<Integer> n2rp1=n2rp(root, da1);
        ArrayList<Integer> n2rp2=n2rp(root, da2);

        int i=n2rp1.size()-1;
        int j=n2rp2.size()-1;

        while(i>=0 && j>=0)
        {
            if(n2rp1.get(i) != n2rp2.get(j))
            {
                break;
            }
            i--;j--;
        }
        return n2rp1.get(i+1);
    }
    public static void PrintInSeq(node root)
    {
        Queue<node> qu=new LinkedList<>();
        qu.add(root);
        while(qu.size()!=0)
        {
            node cp=qu.remove();
            System.out.print(cp.data+" ");
            for(int i=0;i<cp.child.size();i++)
            {
                qu.add(cp.child.get(i));
            }
        }
    }
    public static void zigzag(node root)
    {
        ArrayList<node> stack=new ArrayList<>();
        Queue<node> qu=new LinkedList<>();
        qu.add(root);
        boolean flag=true;
        while(qu.size()!=0)
        {
            node cp=qu.remove();
            System.out.print(cp.data+" ");
            if(flag){
                for(int i=0;i<cp.child.size();i++)
            {
                stack.add(cp.child.get(i));
            }
        }else
        {
            for(int i=cp.child.size()-1;i>=0;i--)
            {
                stack.add(cp.child.get(i));
            }
        }
        if(qu.size()==0)
        {
            while(stack.size()>0)
            {
                qu.add(stack.remove(stack.size()-1));
            }
            flag=!flag;
        }
    }
}
    public static void onequeprint(node root)
    {
        Queue<node> qu=new LinkedList<>();
        qu.add(root);
        while(qu.size()!=0)
        {
            int size=qu.size();
            while(size>0)
            {
                node cp=qu.remove();
                System.out.print(cp.data+" ");
                for(int i=0;i<cp.child.size();i++)
                {
                    qu.add(cp.child.get(i));
                }
                size--;
            }
            System.out.println();

        }
    }
    public static void main(String args[])
    {
        int[] data={10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100};
        construct(data);
        // System.out.println(max(root));
        // System.out.println(lowestcommonanc(root, 110,90));
        onequeprint(root);
        System.out.println();
        // display(root);
    }
}

