public class ThreadSafeAuditLogger {
    // Shared thread-safe buffer across all worker threads
    private static final StringBuffer auditLog = new StringBuffer();

    public static void main(String[] args) throws InterruptedException {
        Runnable task1 = () -> logEvent("AUTH-SERVICE", "User login verified");
        Runnable task2 = () -> logEvent("PAYMENT-API", "Transaction #9948 approved");
        Runnable task3 = () -> logEvent("DB-WORKER", "Backup snapshot completed");

        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);
        Thread t3 = new Thread(task3);

        t1.start();
        t2.start();
        t3.start();

        // Wait for all threads to finish
        t1.join();
        t2.join();
        t3.join();

        System.out.println("=== FINAL AUDIT LOG ===");
        System.out.println(auditLog.toString());
    }

    public static void logEvent(String service, String message) {
        // Safely builds the log entry without race conditions
        auditLog.append("[")
                .append(System.currentTimeMillis())
                .append("] [")
                .append(service)
                .append("]: ")
                .append(message)
                .append("\n");
    }
}
