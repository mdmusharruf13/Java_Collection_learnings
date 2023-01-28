import java.util.HashSet;
import java.util.Set;

class M01_HashSet{
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("one");
        set.add("two");
        set.add("three");
        set.add("four");
        set.add("five");
        set.forEach(n->System.out.println(n));

        HashSet<String> hset = new HashSet<>();
        hset.add("three");
        hset.add("six");
        set.addAll(hset); // three from second set is not added.
        System.out.println(set);
        // removing elements on the basis of specified condition
        set.removeIf(str->str.contains("four"));
        System.out.println(set);
        // removing all the elements from the set
        set.clear();
        System.out.println(set);
    }
}

/*
Note : 
-> Java HashSet class is used to create a collection 
   that uses a hash table for storage.
-> It inherit the AbstractSet class and implements Set Interface.

Important points:
-> HashSet stores the elements by using a mechanism called hashing.
-> HashSet contains only unique elements only.
-> HashSet allows null value.
-> HashSet class is non synchronized.
-> HashSet doesn't maintain the insertion order. (insertion based on hashcode)
-> HashSet is the best approach for search operations

Hierarchy of HashSet class
-> The HashSet class extends AbstractSet class which implements Set interface.
   The Set interface inherits collection & iterable interface in hierarchial order

Methods in HashSet class:
-> add, clear, clone, contains, isEmpty, iterator, remove, size and spliterator.
*/
