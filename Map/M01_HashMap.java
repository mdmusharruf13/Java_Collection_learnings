import java.util.HashMap;
import java.util.Map;

class M01_HashMap{
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("java", 5);
        map.put("cpp", 4);
        map.put("python", 3);
        map.put("swift", 4);
        System.out.println(map);
        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}