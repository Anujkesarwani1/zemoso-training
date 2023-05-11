import java.util.HashMap;
import java.util.Map;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(3, "dog");
        map.put(5, "cat");
        map.put(10, "tiger");
        map.put(14, "lion");
        map.put(72, "elephant");
        map.put(5, "tortoise");

        String animal = map.get(5);
        System.out.println(animal);

        for(Map.Entry<Integer, String> myAnimal: map.entrySet()) {
            int key = myAnimal.getKey();
            String value = myAnimal.getValue();
            System.out.println(key + ": " + value);
        }
    }
}
