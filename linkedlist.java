import java.util.*;

public class linkedlist {// Remove first , Remove last , Add first ,& Add last....
    private Node head;
    public class Node {
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
        }
    }
    public void addfirst(String data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }
    public void addlast(String data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        //placeholder that can be assigned a Node object later.i.e. currNode and head.
        Node currNode;
        currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newnode;
    }
    public void removelast(){
        if(head.next==null){
            head=null;
        }
        Node currNode,prNode;
        currNode=head;
        prNode=head;
        while(currNode.next!=null)
        {
            currNode=currNode.next;
            if(currNode.next!=null){
                prNode=prNode.next;
                break;
            }
        }        
        prNode.next=null;
    }
    public void removefirst(){
        if(head.next==null){
            head=null;
        }
        Node currNode;
        currNode=head;
        head=head.next;
        currNode=null;
    }
    public void display(){
        Node c;
        c=head;
        while(c!=null)
        {
            System.out.print(c.data+" , ");
            c=c.next;
        }
    }
    
    public static void main(String[] args) {
        linkedlist newnode1=new linkedlist();
        newnode1.addfirst("sid");
        System.out.println("\n add first...............manoj");
        newnode1.addfirst("manoj");
        newnode1.display();
        System.out.println("\n add last..............samarth and shashank");
        newnode1.addlast("samarth");
        newnode1.addlast("shashank");
        newnode1.display();
        System.out.println("\n remove first...............manoj");
        newnode1.removefirst();
        newnode1.display();
        System.out.println("\n remove last................shashank");
        newnode1.removelast();
        newnode1.display();
        
    }
    
}
