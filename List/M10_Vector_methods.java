import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class M10_Vector_methods {
    public static void main(String[] args) {

        Vector<Integer> vtr = new Vector<>();
        vtr.add(98);
        vtr.add(66);
        vtr.add(99);
        vtr.add(90);
        
        Vector<Integer> vtr1 = new Vector<>();
        vtr1.add(66);
        vtr1.add(56);

        vtr.addAll(vtr1);

        System.out.println(vtr);
        vtr.set(5,0);
        System.out.println(vtr);
        System.out.println("the string representation : "+vtr.toString());

        System.out.println("is vector1 equal to vector2 ? : "+vtr.equals(vtr1));
        System.out.println("98 exist : "+vtr.contains(98)+" at index "+vtr.indexOf(98));
        List<Integer> list = new ArrayList<>();
        list = vtr.subList(2,5);
        System.out.println("sublist :"+list);
        System.out.println("is the vector empty ? :"+vtr.isEmpty());
        vtr.clear();
        System.out.println("vector after clear : "+vtr.isEmpty());
    }
}
