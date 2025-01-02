import java.util.*;
public class Queues {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        int n;
        String element;
        Queue<String>queue=new LinkedList<String>();
        System.out.println("Is the queue empty initially?: "+queue.isEmpty()+"\nSize of the empty queue: "+queue.size());
        System.out.println("Enter number of elements to be pushed in the queue: ");
        n=scanner.nextInt();
        scanner.nextLine();
        for(int i=1;i<=n;i++){
            System.out.println("Enter element "+i+":");
            element=scanner.nextLine();
            queue.offer(element);//functions like add also queue.add();
        }
        System.out.println("The queue: "+queue+"\nIs the queue empty now?: "+queue.isEmpty()+"\nSize of the queue: "+queue.size());
        System.out.println("The first element: "+queue.peek());
        queue.poll();
        System.out.println("After removing the first element: "+queue);
        String search;
        System.out.println("Enter the element to search:");
        search=scanner.nextLine();
        System.out.println("Is "+search+" present in queue?: "+queue.contains(search));
    }
}
