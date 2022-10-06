import java.util.HashMap;

public class MapExercise {
    public static void main(String[] args){

        HashMap<String, String> map = new HashMap<>();
        map.put("abc1", "address1");//key value, data structure = map
        map.put("abc2", "address2");//key value input search, (data structure:hash) hash map

        System.out.println(map.get("abc1"));
    }
}
