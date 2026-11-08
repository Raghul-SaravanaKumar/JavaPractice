public class TowerOfHanoi {
    // Recursive method
    public static void solveHanoi(int n, char source, char destination, char auxiliary) {
        if (n == 1) { // Base Case
            System.out.println("Move disk 1 from " + source + " to " + destination);
            return;
        }
        // Step 1: Move n-1 disks from source to auxiliary
        solveHanoi(n - 1, source, auxiliary, destination);

        // Step 2: Move the nth disk from source to destination
        System.out.println("Move disk " + n + " from " + source + " to " + destination);

        // Step 3: Move n-1 disks from auxiliary to destination
        solveHanoi(n - 1, auxiliary, destination, source);
    }

    public static void main(String[] args) {
        int numDisks = 3;
        System.out.println("Tower of Hanoi sequence for " + numDisks + " disks:");
        solveHanoi(numDisks, 'A', 'C', 'B'); // A = Source, C = Destination, B = Auxiliary
    }
}
