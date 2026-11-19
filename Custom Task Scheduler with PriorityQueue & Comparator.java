import java.util.*;

record Task(String title, int urgencyLevel) {} // 1 = Highest priority

public class TaskScheduler {
    public static void main(String[] args) {
        // Orders tasks by lowest urgencyLevel number first
        PriorityQueue<Task> taskQueue = new PriorityQueue<>(
            Comparator.comparingInt(Task::urgencyLevel)
        );

        taskQueue.add(new Task("Update documentation", 3));
        taskQueue.add(new Task("Fix production server crash", 1));
        taskQueue.add(new Task("Code review", 2));

        System.out.println("Processing tasks by priority:");
        while (!taskQueue.isEmpty()) {
            System.out.println(taskQueue.poll());
        }
    }
}
