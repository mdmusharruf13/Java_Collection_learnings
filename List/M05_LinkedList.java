import java.util.LinkedList;

public class M05_LinkedList {
    public static void main(String[] args) {
        LinkedList<String> list1 = new LinkedList<>();
        list1.add("java");
        list1.add("cpp");
        list1.add("python");
        list1.add("sql");
        System.out.println(list1);

        LinkedList<String> list2 = new LinkedList<>();
        list2.add("swift");
        list2.add("ruby");
        list2.add("Go");

        // adding list2 items to list1
        list1.addAll(list2);

        System.out.println(list1);

        // adding at particular index in list1
        list1.add(1,"rust");

        System.out.println(list1);

        // adding at first in the list1
        list1.addFirst("C");
        System.out.println(list1);

        // adding at last in the list1
        list1.addLast("javascript");
        list1.add("kotlin");
        list1.add("javascript");
        list1.add("c#");
        list1.add("javascript");
        list1.add("perl");
        System.out.println(list1);

        // removing specific element from array
        list1.remove("ruby");
        System.out.println(list1);

        // removing element on the basis of index
        list1.remove(4);
        System.out.println(list1);

        // removing list2 items from list1
        list1.removeAll(list2);
        System.out.println(list1);

        // removing first  elemet 
        list1.removeFirst();
        System.out.println(list1);

        // removing last elemet 
        list1.removeLast();
        System.out.println(list1);

        // remove first occurrence of element from list
        list1.removeFirstOccurrence("javascript");
        System.out.println(list1);

        // remove last occurence of element from list
        list1.removeLastOccurrence("javascript");
        System.out.println(list1);

        // getting first and last elements in list1
        System.out.println(list1.getFirst());
        System.out.println(list1.getLast());
    }
}

/*
Note : 
-> java linkedlist class can contain duplicate elements.
-> java LinkedList class maintains insertion order.
-> java LinkedList class is non-synchronized.
-> java LL class is fast because mainpulation is fast because no shifting need to occur.
-> java LL class can be used as a list, stack and queue.
*/
