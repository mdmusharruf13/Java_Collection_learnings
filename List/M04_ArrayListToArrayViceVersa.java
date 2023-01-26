import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class M04_ArrayListToArrayViceVersa{
    public static void main(String[] args) {
        
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("java");
        list1.add("cpp");
        list1.add("python");
        list1.add("php");
        
        System.out.print("ArrayList : ");
        System.out.println(list1);

        System.out.println("\nConverting ArrayList to Array : ");
        String items[] = list1.toArray(new String[list1.size()]);
        for(String itm : items){
            System.out.print(itm+" ");
        }
        System.out.println("\n");
        
        System.out.println("Converting Array to ArrayList : ");
        List<String> list2 = new ArrayList<>();
        list2 = Arrays.asList(items);
        System.out.println(list2);
    }
}