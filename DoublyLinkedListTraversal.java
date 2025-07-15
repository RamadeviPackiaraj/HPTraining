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
public class DoublyLinkedListTraversal{
    public static void FarwardTraversal(Node head){
        if(head==null){
            return;
        }
        System.out.print(head.data+" ");
        FarwardTraversal(head.next);
    }
    public static void main(String[] args){
        Node head=new Node(1);
        Node second=new Node(2);
        Node third=new Node(3);
        head.next=second;
        second.prev=head;
        second.next=third;
        third.prev=second;
        System.out.println("Forward Traversal: ");
        FarwardTraversal(head);
    }
    
}