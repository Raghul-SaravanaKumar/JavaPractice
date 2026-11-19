import java.util.*;
import java.util.stream.Collectors;

record Employee(String name, String department) {}

public class GroupByDepartment {
    public static void main(String[] args) {
        List<Employee> staff = List.of(
            new Employee("Arun", "Engineering"),
            new Employee("Priya", "HR"),
            new Employee("Karthik", "Engineering"),
            new Employee("Meera", "Finance"),
            new Employee("Divya", "HR")
        );

        // Groups employees automatically into a Map<String, List<Employee>>
        Map<String, List<Employee>> byDept = staff.stream()
            .collect(Collectors.groupingBy(Employee::department));

        byDept.forEach((dept, empList) -> 
            System.out.println(dept + " -> " + empList));
    }
}
