import java.util.*;

public class LRUCacheExample {
    public static void main(String[] args) {
        int maxCapacity = 3;

        // 'true' enables access-order mode (most recently accessed moves to end)
        Map<Integer, String> cache = new LinkedHashMap<>(maxCapacity, 0.75f, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<Integer, String> eldest) {
                return size() > maxCapacity; // Automatically evicts oldest item
            }
        };

        cache.put(101, "User_A");
        cache.put(102, "User_B");
        cache.put(103, "User_C");
        
        cache.get(101); // Access 101 so it becomes the most recently used
        cache.put(104, "User_D"); // Evicts 102 (the least recently used)

        System.out.println("Current Cache: " + cache);
    }
}
