import java.util.*;
    public class stack{
        protected int[] arr;
        protected int size=0;
        protected int tos=-1;
        public stack()
        {
            reassign(10);
        }
        public stack(int size)
        {
            reassign(size);
        }
        protected void reassign(int size)
        {
            arr=new int[size];
            size=0;
            tos=-1;
        }
        public void push(int val) throws Exception
        {
            if(this.size==this.arr.length)
            {
                throw new Exception("Stack is Full");
            }
            this.tos++;
            this.arr[this.tos]=val;
            this.size++;
        }
        public void display()
        {
            for(int i=tos;i>=0;i--)
            {
                System.out.print(arr[i]+" ");
                
            }System.out.println();
        }
        public int peek()
        {
            if(this.size==0)
            throw new EmptyStackException();
            return this.arr[this.tos];
        }
        public int size()
        {
            return this.size();
        }
        public boolean isEmpty()
        {
            return this.size==0;
        }
        public int pop()
        {
            if(this.size==0)
            {
                throw new EmptyStackException();
            }
            int rv=this.arr[this.tos];
            this.arr[this.tos]=0;
            this.tos--;
            this.size--;
            return rv;
        }
    public static void main(String args[]) throws Exception
    {
        stack st=new stack(10);
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
        st.push(70);
        st.display();
        System.out.println(st.pop());
        st.display();
    }

}