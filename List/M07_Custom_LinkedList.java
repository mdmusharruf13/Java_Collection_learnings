import java.util.LinkedList;

class Languages{
    int rating;
    String name;
    Languages(String name, int rating){
        this.name = name;
        this.rating = rating;
    }
}

public class M07_Custom_LinkedList {
    public static void main(String[] args) {
        Languages l1 = new Languages("java",5);
        Languages l2 = new Languages("c++",4);
        Languages l3 = new Languages("python",3);
        
        LinkedList<Languages> list = new LinkedList<>();
        list.add(l1);
        list.add(l2);
        list.add(l3);

        for(Languages lang : list){
            System.out.println("name : "+lang.name+"\t rating : "+lang.rating);
        }
    }
}
