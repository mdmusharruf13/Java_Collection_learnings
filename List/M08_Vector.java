import java.util.Vector;

class M08_Vector{
    public static void main(String[] args) {
        Vector <String> v = new Vector<>();
        v.add("java");
        v.addElement("cpp");
        System.out.println(v);
        // checking size and capacity
        System.out.println("size is :"+v.size());
        System.out.println("Default capacity is :"+v.capacity());
        if(v.contains("java")){
            System.out.println("java is present at index : "+v.indexOf("java"));
        }
        System.out.println("first element is : "+v.firstElement());
        System.out.println("last element is : "+v.lastElement());
        v.addElement("java");
        v.addElement("python");
        v.add("swift");
        System.out.println("element at index 2 is : "+v.get(2));
        System.out.println("first element : "+v.firstElement());
        System.out.println("last element : "+v.lastElement());
        
        // hash code for this vector
        System.out.println("hash code for this vector is : "+v.hashCode());
        System.out.println("removing element at index "+v.remove("java"));
        System.out.println("removing element at index "+v.remove(2));
        System.out.println("removing element using removeElementAt() index 2 : "+v.removeElement("python"));
    }
}

/*
Note : 
-> vector is like dynamic array which can grow or shrink its size.
-> vector is synchronized.
-> vector contains many legacy methods that are not the part of a 
   collection framework.
*/