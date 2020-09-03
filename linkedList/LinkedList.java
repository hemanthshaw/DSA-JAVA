    import java.util.*;
    public class Main {
        public static void main(String args[])throws Exception {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            LinkedList list=new LinkedList();
            for(int i=0;i<n;i++)
            list.addLast(sc.nextInt());
            list.display();
            list.reverse();
            list.display();
            list.removeFirst();
            list.display();
            list.removeLast();
            list.addFirst(10);
            list.addLast(100);
            list.display();
            list.removeNodeAt(3);
            list.display();
            System.out.println("mid node :"+list.getMid());
            
        }
    }
class LinkedList
{
    private int size=0;
    private class Node
    {
        int data;
        Node next;
        Node(int data){
          this.data=data;
          this.next=null;
        }
    }
    private Node head;
    private Node tail;
    LinkedList()
    {
        this.head=null;
        this.tail=null;
    }
    public void addLast(int item)
    {
        Node node =new Node(item);
        this.addLast(node);
    }
    public void addFirst(int item)
    {
        Node node =new Node(item);
        this.addFirst(node);
    }
    private void addLast(Node node)
    {
        if(this.head==null)
        this.head=this.tail=node;
        else
        {
            this.tail.next=node;
            this.tail=this.tail.next;
            this.size++;
        }
    }
    private void addFirst(Node node)
    {
        if(this.head==null)
        this.head=this.tail=node;
        else
        {
            node.next=this.head;
            this.head=node;
            this.size++;
        }
    }
     public int removeFirst()throws Exception
     {
            if(this.head==null)
            throw new Exception("empty");
            else
            {
                int rv=this.head.data;
                this.head=this.head.next;
                this.size--;
                return rv;
            }
     }
     public int removeLast()throws Exception
     {
          if(this.head==null)
          throw new Exception("full");
          else
          {
              Node curr=this.head;
              while(curr.next!=tail)
              curr=curr.next;
              curr.next=null;
              int rv=this.tail.data;
              this.tail=curr;
              this.size--;
              return rv;
          }
     }
     public int size()
     {
         return this.size;
     }
     private Node getNodeAt(int index)throws Exception
     {
         if(index<0 || index>=this.size())
           throw new Exception("invalid index");
         Node curr=this.head;
         for(int i=0;i<index;i++)
         curr=curr.next;
         return curr;
     }
     public void removeNodeAt(int index)throws Exception
     {
        if(index<0 || index>=this.size())
         throw new Exception("invalid index");
           
         if(index==0)
         this.removeFirst();
         if(index==this.size()-1)
         this.removeLast();

         Node curr_node=getNodeAt(index);
         Node prev_node=getNodeAt(index-1);
         prev_node.next=curr_node.next;
         curr_node.next=null;
         this.size--;
     }
     public int getMid()throws Exception
     {
         if(this.head==null)
         throw new Exception("list is empty");
         Node slow=this.head;
         Node fast=this.head;
         while(fast!=null && fast.next!=null)
         {
             slow=slow.next;
             fast=fast.next.next;
         }
         return slow.data;
     }
     public void reverse()
     {
         if(this.head==null)
         return;
         
         Node curr=this.head;
         Node prev=null;
         while(curr!=null)
         {
            Node next_node=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next_node;
         }
         this.tail=this.head;
         this.head=prev;
     }
     public void display()
     {
         StringBuffer sb=new StringBuffer();
         for(Node curr=this.head;curr!=null;curr=curr.next)
         sb.append("->"+curr.data);
         System.out.println(sb);
     }
     private void removeNode(Node node)
     {
         if(this.head==node)
         {
             this.head=this.head.next;
             return;
         }
         Node curr=this.head;
         Node prev=curr;
         while(curr!=null && curr!=node){
            prev=curr;
            curr=curr.next;
         }  
         if(curr==null)
         return;
         prev.next=node.next;
         node.next=null; 
         this.size--;
     }
}