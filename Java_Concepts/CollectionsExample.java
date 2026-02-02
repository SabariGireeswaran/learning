import java.util.*;

public class CollectionsExample {
    public static void main(String[] args) {
        // List
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        System.out.println("List: " + list);

        // Set (no duplicates)
        Set<String> set = new HashSet<>();
        set.add("apple");
        set.add("apple");
        System.out.println("Set: " + set);

        // Map (key -> value)
        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 2);
        map.put("banana", 3);
        System.out.println("Map: " + map);

        // iterate
        for (Map.Entry<String,Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }
}