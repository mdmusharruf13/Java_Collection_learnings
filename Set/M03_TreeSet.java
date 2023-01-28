import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

class M03_TreeSet{
    public static void main(String[] args) {
        NavigableSet<String> ts = new TreeSet<>();
        ts.add("java");
        ts.add("cpp");
        ts.add("python");
        ts.add("kotlin");
        ts.add("java");
        ts.add("javascript");
        ts.add("php");
        ts.add("ruby");
        ts.add("swift");
        ts.add("rust");
        ts.add("go");
        Iterator<String> itr = ts.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("treeset in reverse...");
        Iterator<String> itr1 = ts.descendingIterator();
        while(itr1.hasNext()){
            System.out.println(itr1.next());
        }

        System.out.println("first element is : "+ts.first());
        System.out.println("last element is : "+ts.last());

        System.out.println("elements higher than java "+ts.higher("java"));
        System.out.println("elements lower than java "+ts.lower("java"));
         
        System.out.println("return and removing the first(lowest) element : ");
        System.out.println("Lowest value : "+ts.pollFirst());

        System.out.println("return and removing the last(highest) element : ");
        System.out.println("Highest value : "+ts.pollLast());

        System.out.println("sorting the treeset in descending without iterator");
        System.out.println("Reverse set : "+ts.descendingSet());

        System.out.println("return whose value is strictly less than the supplied parameter");
        System.out.println(ts.headSet("kotlin")); 
        System.out.println(ts.headSet("kotlin",true)); 

        System.out.println("subset : "+ts.subSet("java","python"));
        System.out.println("subset : "+ts.subSet("java",false,"python",true));

        System.out.println("tailset : "+ts.tailSet("java"));
        System.out.println("tailset : "+ts.tailSet("java",false));
        
    }
}

/*
Note : 
-> Java TreeSet class implements the set interface that uses a tree for storage. 
   It inherits AbstractSet class and implements the NavigableSet interface. The 
   object of TreeSet class are stored in ascending order.
-> TreeSet class contains unique elements only like HashSet.
-> TreeSet can access abd retrieval time are quiet fast.
-> TreeSet class doesn't allow null elements.
-> TreeSet class is non synchronized.
-> TreeSet class maintains ascending order.
-> TreeSet class contains unique elements only HashSet.

methods:
-> add(), addAll(), ceiling(), descendingIterator(), descendingSet(), floor(), headSet(), higher(), iterator(), lower(), pollFirst(), pollLast(), spliterator() subSet(), tailSet(), first(), last(), clear(), size(), remove(), isEmpty(), contains(), clone().
*/