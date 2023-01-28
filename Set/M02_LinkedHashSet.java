import java.util.LinkedHashSet;

public class M02_LinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(598);
        lhs.add(599);
        lhs.add(590);
        lhs.add(566);
        lhs.add(598);
        System.out.println(lhs);
        System.out.println(lhs.contains(598));

    }
}
/*
Note : 
-> Java LinkedHashSet class is a hashtable and linked list implementation of the 
   set interface. It inherits the HashSet class and implements the Set interface.
-> Java LinkedHashSet class contains unique elements only like HashSet.
-> Java LinkedHashSet class provides all optional set operations and 
   permits null elements.
-> Java LinkedHashSet class is non-synchronized.
-> Java LinkedHashSet class maintains insertion order.
*/