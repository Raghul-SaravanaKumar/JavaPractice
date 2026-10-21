import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K, V> {
    private final LinkedHashMap<K, V> map;
    private final int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        // true activates access-order traversal instead of insertion-order
        this.map = new LinkedHashMap<K, V>(capacity, 0.75f, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
                return size() > LRUCache.this.capacity; // Evicts oldest when capacity is breached
            }
        };
    }

    // Synchronized methods ensure basic thread safety
    public synchronized V get(K key) {
        return map.getOrDefault(key, null);
    }

    public synchronized void put(K key, V value) {
        map.put(key, value);
    }

    public synchronized void display() {
        System.out.println(map);
    }

    public static void main(String[] args) {
        LRUCache<Integer, String> cache = new LRUCache<>(3);
        cache.put(1, "A");
        cache.put(2, "B");
        cache.put(3, "C");
        cache.get(1);      // Access 1, making it the most recently used
        cache.put(4, "D"); // Capacity exceeded, element 2 (eldest unaccessed) is evicted

        cache.display(); 
        // Expected Output: {3=C, 1=A, 4=D}
    }
}
