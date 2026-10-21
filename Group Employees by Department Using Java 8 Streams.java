import java.util.*;
import java.util.stream.Collectors;

class Employee {
    private String name;
    private String department;
    private double salary;

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getDepartment() { return department; }
    public String getName() { return name; }
    
    @Override
    public String toString() { return name; }
}

public class StreamGrouping {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Alice", "IT", 85000),
            new Employee("Bob", "HR", 60000),
            new Employee("Charlie", "IT", 95000),
            new Employee("David", "Finance", 75000)
        );

        // Grouping employee names by their respective department
        Map<String, List<Employee>> employeesByDept = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

        System.out.println(employeesByDept);
        // Expected Output: {Finance=[David], HR=[Bob], IT=[Alice, Charlie]}
    }
}
