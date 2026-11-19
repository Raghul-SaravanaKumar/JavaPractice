import java.util.*;

public class SetOperations {
    public static void main(String[] args) {
        Set<String> user1Skills = Set.of("Java", "SQL", "Docker", "AWS");
        Set<String> user2Skills = Set.of("Python", "Java", "AWS", "React");

        // 1. Intersection (Common skills)
        Set<String> common = new TreeSet<>(user1Skills);
        common.retainAll(user2Skills);

        // 2. Union (All unique skills combined)
        Set<String> allUnique = new TreeSet<>(user1Skills);
        allUnique.addAll(user2Skills);

        // 3. Difference (Skills only User 1 has)
        Set<String> onlyUser1 = new TreeSet<>(user1Skills);
        onlyUser1.removeAll(user2Skills);

        System.out.println("Common Skills: " + common);
        System.out.println("All Combined:  " + allUnique);
        System.out.println("Only User 1:   " + onlyUser1);
    }
}
