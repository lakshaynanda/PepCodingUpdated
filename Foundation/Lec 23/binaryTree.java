import java.util.*;

class binaryTree
{
    static node root=null;
    static class node
    {
        int data=0;
        node left;
        node right;
        node(int d)
        {
            this.data=d;
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
            else{
                node n=new node(data[i]);
                if(root==null)
                {
                    root=n;
                }
                else{
                    node cp=stack.get(stack.size()-1);
                    if(cp.left==null)
                    {
                        cp.left=n;
                    }
                    else
                    {
                        cp.right=n;
                    }
                }
                stack.add(n);
            }
        }
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
    public static int count(node croot)
    {
        if(croot==null)
        {
            return 1;
        }
        int myans=1;
        if(croot.left != null)
        {
            myans+=count(croot.left);
        }        
        if(croot.right != null)
        {
            myans+=count(croot.right);            
        }
        return myans;
    }
    public static int height(node root)
    {
        if(root==null)
        {
            return 0;
        }
        int myheight=0;
        if(root.left!=null)
        {
            myheight=height(root.left);
        }
        if(root.right!=null)
        {
            int rh=height(root.right);
            myheight=myheight<rh?rh:myheight;
        }
        return myheight+1;
    }
    public static int max(node root)
    {
        if(root==null)
        {
            return 0;
        }
        int mymax=root.data;
        if(root.left!=null)
        {
            int lm=max(root.left);
            mymax=mymax<=lm?lm:mymax;
        }
        if(root.right!=null)
        {
            int rm=max(root.right);
            mymax=mymax<=rm?rm:mymax;
        }
        return mymax;
    }
    public static boolean find(node root,int data)
    {
        if(root==null)
        {
            return false;
        }
        if(root.data==data)
        {
            return true;
        }
        if(root.left!=null)
        {
            boolean ans=find(root.left,data);
            if(ans)
            {
                return true;
            }
        }
        if(root.right!=null)
        {
            boolean ans=find(root.right, data);
            if(ans)
            {
                return true;
            }
        }
        return false;
    }
    public static void preOrder(node root)
    {
        System.out.print(root.data+" ");
        if(root.left!=null)
        {
            preOrder(root.left);
        }
        if(root.right!=null)
        {
            preOrder(root.right);
        }        
    }
    public static void inOrder(node root)
    {
        
        if(root.left!=null)
        {
            inOrder(root.left);
        }
        System.out.print(root.data+" ");
        if(root.right!=null)
        {
            inOrder(root.right);
        }        
    }
    public static void postOrder(node root)
    {
        
        if(root.left!=null)
        {
            postOrder(root.left);
        }
        
        if(root.right!=null)
        {
            postOrder(root.right);
        }
        System.out.print(root.data+" ");        
    }
    
    public static void preorderI(node root)
    {
        ArrayList<node> stack=new ArrayList<>();
        stack.add(root);
        while(stack.size()>0)
        {
            node cp=stack.get(stack.size()-1);
            stack.remove(stack.size()-1);
            System.out.print(cp.data+" ");
            if(cp.right!=null)
            {
                stack.add(cp.right);
            }
            if(cp.left!=null)
            {
                stack.add(cp.left);
            }
        }
    }
    public static node construct1(int[] pre, int[] in,int plo,int phi,int ilo,int ihi)
    {
        if(ilo==ihi)
        {
            node basenode=new node(in[ilo]);
            return basenode;
        }
        node croot=new node(pre[plo]);
        int count=0;
        int i=ilo;
        while(pre[plo]!=in[i]){
            count++;
            i++;
        }
        croot.left=construct1(pre, in, plo+1, plo+count, ilo, ilo+count-1);
        croot.right=construct1(pre, in, plo+count+1, phi, i+1, ihi);
        return croot;
    }
    static class helper{
        int dia=0;
        int height=0;
    }
    public static helper diameter(node root)
    {
        if(root==null)
        {
            helper baseAns=new helper();
            return baseAns;
        }
        helper left=diameter(root.left);
        helper right=diameter(root.right);
        helper myans=new helper();
        myans.dia=Math.max(left.height+right.height+1, Math.max(left.dia,right.dia));
        myans.height=Math.max(left.height,right.height)+1;
        return myans;
    }
    static class bstHelper
    {
        boolean isBst=true;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int height=0;
        boolean isBalanced=true;
    }
    public static bstHelper isBalBst(node root){
        if(root == null){
            bstHelper baseAns = new bstHelper();
            return baseAns;
        }

        bstHelper left = isBalBst(root.left);
        bstHelper right = isBalBst(root.right);
        bstHelper myAns = new bstHelper();
        myAns.isBst = left.isBst && right.isBst && left.max<root.data && right.min>root.data;
        myAns.isBalanced = left.isBalanced && right.isBalanced && (left.height-right.height)>=-1 &&(left.height-right.height)<=1;
        if((myAns.isBst && myAns.isBalanced) == false){
            return myAns;
        }
        myAns.height = Math.max(left.height, right.height)+1;
        myAns.max = Math.max(root.data, Math.max(left.max, right.max));
        myAns.min = Math.min(root.data, Math.min(left.min, right.min));
        return myAns;
    }
    static class lbHelper{
        boolean isBst=true;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        node lbroot=null;
        int size=0;
    }
   public static lbHelper isBala(node root)
   {
       if(root==null)
       {
           lbHelper baseres=new lbHelper();
           return baseres;
       }
       lbHelper left=isBala(root.left);
       lbHelper right=isBala(root.right);
       lbHelper myans=new lbHelper();
       myans.isBst=left.isBst && right.isBst && root.data>left.max && root.data<right.min;

       if(myans.isBst)
       {
            myans.size=left.size+right.size+1;
            myans.min=Math.min(root.data,left.min);
            myans.max=Math.max(root.data,right.max);
            myans.lbroot=root;
        }
        else{
            if(left.size>right.size)
            {
                myans.lbroot=left.lbroot;
                myans.size=left.size;
            }
            else
            {
                myans.lbroot=right.lbroot;
                myans.size=right.size;
            }
        }
        return myans;
   }

    public static void main(String args[])
    {
        int data1[]={100,50,25,12,-1,30,-1,-1,75,60,-1,80,-1,-1,-1,150,190,-1,180};
        int data[]={10,20,40,-1,50,80,-1,90,-1,-1,-1,30,60,-1,70};
        // int data[]={50,70,20,-1,8,-1,-1,30,90,-1,10,5,6,7};
        // int in[]={20,70,8,50,90,30,10};
        // int pre[]={50,70,20,8,30,90,10};
        construct(data1);
        // display(root);
        // System.out.println(count(root));
        // System.out.println(height(root));
        // System.out.println(max(root));
        // System.out.println(find(root,45));
        // preOrder(root);
        // System.out.println();
        // inOrder(root);
        // System.out.println();
        // postOrder(root);
        // System.out.println();
        // preOrder(root);
        // helper root = construct1(pre, in, 0, pre.length-1, 0, in.length-1);
        // System.out.println("Hello");
        // display(root);
        // System.out.println(diameter(root));
        lbHelper lb=isBala(root);
        System.out.println(lb.lbroot.data);
        System.out.println(lb.size);
    }
}
