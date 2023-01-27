import java.util.Vector;

public class M09_Vector_copyInto_array {
    public static void main(String[] args) {
        Vector<Integer> vt = new Vector<>();
        vt.add(12);
        vt.addElement(20);
        vt.insertElementAt(15,1);
        System.out.println(vt);
        Integer arr[] = new Integer[vt.size()];
        vt.copyInto(arr);
        for(Integer i : arr){
            System.out.println(i);
        }
    }
}
