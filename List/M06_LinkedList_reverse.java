import java.util.Iterator;
import java.util.LinkedList;

public class M06_LinkedList_reverse {
    public static void main(String[] args) {
       LinkedList<Integer> ll = new LinkedList<>(); 
       ll.add(5);
       ll.add(9);
       ll.add(100);

    //    traversing the list of elements in reverse order
    Iterator<Integer> itr = ll.descendingIterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
