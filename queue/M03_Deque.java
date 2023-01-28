import java.util.Deque;
import java.util.ArrayDeque;

class M03_Deque{
    public static void main(String[] args) {

        Deque<String> dq = new ArrayDeque<>();
        // adding elements at first and at last. 
        dq.add("Musharruf");
        dq.addFirst("Mohammad");
        dq.addLast("Nawaz");
        
        System.out.println(dq);

        Deque<Integer> dq1 = new ArrayDeque<>();
        dq1.addFirst(66);
        dq1.offer(98);
        dq1.offerLast(90);
        dq1.offer(99);
        dq1.offer(3);

        // peek() returns the element.
        System.out.println(dq1);
        System.out.println(dq1.peek()+" got using peek()");

        // poll() removes and return the element.
        System.out.println(dq1.poll()+" removed using poll()");
        System.out.println(dq1);
        System.out.println(dq1.pollFirst()+" removed using pollFirst()");
        System.out.println(dq1);
        System.out.println(dq1.pollLast()+" removed using pollLast()");
        System.out.println(dq1);


    }
}

/*
Note : 
-> Deque is the subtype of interface queue.
-> The Deque supports the addition as well as removal of elements from 
   both ends of the data structure.
-> Deque can be used as a stack or queue.
-> Deque is an acronym for "Double ended queue".
-> Deque interface is implemented by ArrayDeque class.
-> Null elements are not allowed in the ArrayDeque.
-> ArrayDeque is not thread safe in the absence of external synchronization.
-> ArrayDeque is faster than LinkedList and Stack.

methods : 
-> offer() : add elements in ArrauDeque
-> add() : add elements in ArrauDeque
-> remove() : retruve and remove head of the deque.
-> addFirst();
-> addLast();
-> offerFirst();
-> offerLast();
-> peekFirst();
-> peekLast();
-> 
-> 
-> 
-> 
-> 
-> 
-> 
*/