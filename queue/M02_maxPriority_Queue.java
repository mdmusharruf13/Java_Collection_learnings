import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class M02_maxPriority_Queue {
    public static void main(String[] args) {
        
        // first way of making max priority queue
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.offer(98);
        pq.offer(66);
        pq.offer(90);
        pq.offer(99);
        System.out.println(pq);

        // max priority queue with custom comparator
        PriorityQueue<Integer> pq1 = new PriorityQueue<>(
            new Comparator<Integer>(){
                public int compare(Integer a,Integer b){
                    if(a<b)
                        return 1;
                    if(a>b)
                        return -1;
                    return 0;
                }
            });
        
        pq1.add(5);
        pq1.add(59);
        pq1.add(29);
        pq1.add(23);
        pq1.add(16);
        System.out.println(pq1);
        
        // max priority queue with lambda expression
        PriorityQueue<Integer> pq2 = new PriorityQueue<>((a,b)->b-a);
        pq2.add(598);
        pq2.add(590);
        pq2.add(566);
        System.out.println(pq2);
    }
}
