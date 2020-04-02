import java.util.*;
public class linkedlist
{
    public static class Linkedlist{
        public class Node
        {
            int data=0;
            Node next=null;
            public Node(int data)
            {
                this.data=data;
            }
        }
        Node head=null;
        Node tail=null;
        int size=0;
        public void display()
        {
            Node curr=head;
            while(curr!=null)
            {
                System.out.print(curr.data+"->");
                curr=curr.next;
            }
            System.out.println();
        }
        public int size()
        {
            return size;
        }
        public boolean isEmpty(){
            return size==0 ? true:false;
        }
        public void addFirst(int data)
        {
            Node node=new Node(data);
            {
                if(size==0){
                    head=node;
                    tail=node;
                }else
                {
                    node.next=head;
                    head=node;
                }
                size++;
            }
        }
        public void addLast(int data)
        {
            Node node=new Node(data);
            {
                if(size==0){
                    head=node;
                    tail=node;
                }else
                {
                    tail.next=node;
                    tail=node;
                }
                size++;
            }
        }
        public int getFirst()
        {
            if(size==0)
            {
                System.out.println("NoSuchElementException");
                return -1;
            }
            return head.data;
        }
        public int getLast()
        {
            if(size==0)
            {
                System.out.println("NoSuchElementException");
                return -1;
            }
            return tail.data;
        }
        public Node getNodeAt(int idx)
        {
            if(idx<0 || idx>=size)
            {
                return null;
            }
            if(idx==0)
            {
                return head;
            }else if(idx==size-1)
            {
                return tail;
            }
            else
            {
                Node curr=head;
                while(idx-- > 0)
                {
                    curr=curr.next;
                }
                return curr;
            }
        }
        public void addAt(int data,int idx)
        { 
            if(idx<0 || idx>=size)
            {
                return;
            }
            if(idx==0)
            {
                addFirst(data);
            }
            else if(idx==size)
            {
                addLast(data);
            }
            else
            {
                Node prevNode = getNodeAt(idx-1);
                Node forwardNode=prevNode(idx+1);
                Node node=new Node(data);
                size++;
                prevNode.next=node;
                node.next=forwardNode;
            }
        }
        public void removeAt(int idx)
        {
            if(idx<0 || idx>=size)
            {
                return;
            }
            if(idx==0)
            {
                removeFirst(data);
            }
            else if(idx==size-1)
            {
                removeLast(data);
            }
            else
            {
                Node prevNode = getNodeAt(idx-1);
                // Node forwardNode=prevNode(idx+1);
                Node node=prevNode.next;
                prevNode.next=node.next;
                node.next=null;
                size--;
            }
            return data;
        }
        public int getAt(int idx)
        {
            if(idx<0 || idx>=size)
            {
                System.out.println("NoSuchElementException");
                return -1;
            }
            return tail.data;
        }
        public int removeFirst()
        {
            if(size==0)
            {
                System.out.println("NoSuchElementException");
                return -1;
            }
            int rv=head.data;
            if(size==1)
            {
                head=null;
                tail=null;
            }else
            {
                Node temp=head;
                head=head.next;
                temp.next=null;
                // head=head.data;
            }
            size--;
            return rv;
        }
        public int removeLast()
        {
            if(size==0)
            {
                System.out.println("NoSuchElementException");
                return -1;
            }
            int rv=tail.data;
            if(size==1)
            {
                head=null;
                tail=null;
            }else
            {
                Node secondLast=getNodeAt(size-2);
                secondLast.next=null;
                tail=secondLast;
            }
            size--;
            return rv;
        }
    }
    public void reverseList()
    {
        Node curr=head;
        Node prev=null;
        Node forw=null;
        while(curr!=null)
        {
            forw=curr.next;
            curr.next=prev;
            prev=curr;
            curr=forw;
        }
        tail=head;
        head=prev;
    }
    public int midElemeny()
    {
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.data;
    }
    public static void main(String args[])
    {
        Linkedlist ll=new Linkedlist();
        for(int i=1;i<=10;i++)
        {
            ll.addFirst(i*10);
        }
        ll.display();
        Linkedlist li=new Linkedlist();
        for(int i=1;i<=10;i++)
        {
            li.addLast(i*10);
        }
        li.display();
        System.out.println(li.removeLast());
        System.out.println(li.removeLast());
        System.out.println(li.removeFirst());
        System.out.println(li.removeFirst());
        
        li.display();
        li.addAt(3,2);
        li.display();
    }
    
}