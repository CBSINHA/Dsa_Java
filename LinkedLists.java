import java.util.LinkedList;;
public class LinkedLists{
    public static void main(String[]args){
        LinkedList<String>ll=new LinkedList<String>();//creates a doubly LL
        ll.add("A");
        ll.add("B");
        ll.add("C");
        System.out.println("The original LinkedList: "+ll);
        ll.add(1,"1");
        ll.add(3,"2");
        ll.add(5,"3");
        ll.addLast("-1");
        System.out.println("The updated LinkedList: "+ll);
        ll.removeLast();
        System.out.println("After deleting last element: "+ll);
        System.out.println("Size: "+ll.size()+"\nEmpty?:"+ll.isEmpty()+"\nIndex of C:"+ll.indexOf("C"));

    }
}