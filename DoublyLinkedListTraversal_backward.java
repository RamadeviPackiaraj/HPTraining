import java.util.*;
class Node{
    int data;
    Node next;
    Node prev;
    Node(int val){
     data=val;
     next=null;
     prev=null;
    }
}
    public class DoublyLinkedListTraversal_backward{
        public static void BackwardTraversal(Node tail){
            Node curr=tail;
            while(curr!=null){
                System.out.println(curr.data+" ");
                curr=curr.prev;
            }
        }
    public static void main(String[] args){
        Node head=new Node(78);
        Node second=new Node(23);
        Node third=new Node(67);
        Node four=new Node(19);
        head.next=second;
        second.prev=head;
        second.next=third;
        third.prev=second;
        third.next=four;
        four.prev=third;
        BackwardTraversal(four);
    }
    
}
