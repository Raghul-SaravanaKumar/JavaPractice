import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerPattern {
    public static void main(String[] args) {
        // Thread-safe bound queue structure
        BlockingQueue<Integer> sharedQueue = new ArrayBlockingQueue<>(5);

        // Producer Thread logic
        Thread producer = new Thread(() -> {
            try {
                for (int i = 1; i <= 5; i++) {
                    System.out.println("Produced item: " + i);
                    sharedQueue.put(i); // Automatically blocks if queue is full
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        // Consumer Thread logic
        Thread consumer = new Thread(() -> {
            try {
                while (true) {
                    // Automatically blocks if queue is empty
                    Integer item = sharedQueue.take();
                    System.out.println("Consumed item: " + item);
                    if (item == 5) break; // Terminate condition for illustration
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        producer.start();
        consumer.start();
    }
}
