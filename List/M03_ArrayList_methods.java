import java.util.ArrayList;

public class M03_ArrayList_methods {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println("the size of arraylist is :"+list.size());
        list.add("java");
        list.add("cpp");
        list.add("c");
        System.out.println("the size of arraylist is :"+list.size());
        System.out.println(list);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("python");
        list2.add("javascript");
        list2.add("solidity");
        
        // adding list2 elements at 1st index 
        list.addAll(1,list2);
        System.out.println(list);

        // adding list elements to list2
        list2.addAll(list);
        System.out.println(list2);

        // removing first occurrence of solidity in list2 
        list2.remove("solidity");
        System.out.println(list2);
        
        // removing all items from list2
        list2.removeAll(list2);
        System.out.println(list2);
        System.out.println("is the list is Empty : "+list2.isEmpty());
        
        System.out.println("After retaining ");
        list2.add("python");
        list2.add("javascript");
        list2.add("solidity");
        list2.add("java");
        list.retainAll(list2);
        list.forEach(n->System.out.println(n));
    }
}
