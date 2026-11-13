public class ThreadSafeStringBufferExample {
    public static void main(String[] args) throws InterruptedException {
        // StringBuffer is synchronized (thread-safe)
        StringBuffer buffer = new StringBuffer("Count: ");

        // Two threads modifying the same StringBuffer
        Thread t1 = new Thread(() -> {
            synchronized (buffer) {
                buffer.append("A");
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (buffer) {
                buffer.append("B");
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Safe Output: " + buffer.toString());
    }
}
