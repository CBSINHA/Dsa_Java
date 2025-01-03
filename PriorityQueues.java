import java.util.Collection;
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
    }
}
