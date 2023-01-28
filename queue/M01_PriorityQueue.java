import java.util.PriorityQueue;

class M01_PriorityQueue{
    public static void main(String[] args) {

        // by default the queue is minimum
        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("java");
        pq.add("cpp");
        pq.add("python");
        pq.add("C");
        pq.add("swift");
        pq.add("kotlin");
        System.out.println(pq);
        System.out.println("head : "+pq.element());
        System.out.println("head : "+pq.peek());
        pq.poll();
        System.out.println(pq);
        System.out.println("Is empty : "+pq.isEmpty());
        System.out.println(pq.size());
        System.out.println(pq.remove());
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq.remove("kotlin"));
        pq.offer("javascript");
        System.out.println(pq);
    }
}

/*
Note : 
-> remove() : Retrieves and removes the head of this queue. This method differs 
   from poll only in that it throws an exception if this queue is empty.
-> Priority Queue allows duplicate values.
-> Priority Queue does not permit null elements.
-> By default, the priority queue in java is min Priority queue with natural 
   ordering. To make it max we have to use a custom comparator so that head of 
   the queue returns the greatest element in the queue. 
*/