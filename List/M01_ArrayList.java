import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class M01_ArrayList{
    public static void main(String [] args){
        
        // creating ArrayLit of generic tupe
        List<Integer> list = new ArrayList<Integer>();
        // creating ArrayList of string type
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Md");
        list2.add("Musharruf");
        list2.add("Nawaz");
        list2.add("Learning");
        list2.add("Java");
        System.out.println("\n"+list2);

        // set and get method in ArrayList
        list2.set(0,"Mohammad");
        System.out.println("the language is : "+list2.get(4));
        System.out.println(list2);
        
        // adding elements into ArrayList
        list.add(18);
        list.add(12);
        list.add(50);
        list.add(16);
        list.add(98);
        list.add(24);

        System.out.println(list);

        // sorting the first ArrayList
        Collections.sort(list);
        System.out.println(list);

        // iterating list using iterator interface
        ListIterator<Integer> listItr = list.listIterator(list.size());
        while(listItr.hasPrevious()){
            int value = listItr.previous();
            System.out.println(value);
        }

        // iterating the ArrayList using foreach loop
        list.forEach(n->System.out.print(n+" "));

        // iterating ArrayList using forEachRemaining() with lambda Expression
        Iterator <Integer> itr = list.iterator();
        itr.forEachRemaining(a->System.out.println(a));
    }
}