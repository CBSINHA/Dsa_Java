public class Singly_LL{
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }
    public static Node InsertAtEnd(Node head,int value){
        Node node=new Node(value);
        if(head==null){
            head=node;
            return head;
        }
        Node current=head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=node;
        return head;
    }
    public static void display(Node head){
        while(head!=null){
            System.out.print(head.data+"-->");
            head=head.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Node head=null;
        head=InsertAtEnd(head,1);
        head=InsertAtEnd(head, 2);
        head=InsertAtEnd(head, 234);
        head=InsertAtEnd(head, 66);
        display(head);
    }
}