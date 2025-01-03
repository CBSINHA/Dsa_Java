import java.util.Collections;
import java.util.PriorityQueue;
public class PriorityQueues {
    public static void main(String[] args) {
        PriorityQueue<Integer>pq=new PriorityQueue<Integer>();
        PriorityQueue<Integer>rpq=new PriorityQueue<Integer>(Collections.reverseOrder());
        pq.offer(1);
        pq.offer(2);
        pq.offer(8);
        pq.offer(5);
        pq.offer(4);
        System.out.println("The priority queue(default order and will maintain a minheap property): "+pq);
        rpq.offer(1);
        rpq.offer(2);
        rpq.offer(8);
        rpq.offer(5);
        rpq.offer(4);
        System.out.println("The priority queue(reversed order and will maintain a maxheap property): "+rpq);
        System.out.println("Priority queue in ascending order:");
        while (!pq.isEmpty()) {
            System.out.print(pq.poll()+" ");
        }
        System.out.println();
        System.out.println("Priority queue in descending order:");
        while (!rpq.isEmpty()) {
            System.out.print(rpq.poll()+" ");
        }
    }
}
