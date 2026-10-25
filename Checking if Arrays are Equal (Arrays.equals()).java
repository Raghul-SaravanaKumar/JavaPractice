import java.util.Arrays;

public class EqualArrays {
    public static void main(String[] args) {
        int[] list1 = {1, 2, 3};
        int[] list2 = {1, 2, 3};
        int[] list3 = {3, 2, 1};

        // Checking equality
        boolean check1 = Arrays.equals(list1, list2);
        boolean check2 = Arrays.equals(list1, list3);

        System.out.println("Are list1 and list2 equal? " + check1);
        System.out.println("Are list1 and list3 equal? " + check2);
    }
}
