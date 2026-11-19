package streams;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeMain {

    public static void main(String[] args) {

        List<Employee> employees = List.of(
                new Employee(1, "John", "IT", 90000),
                new Employee(2, "David", "HR", 60000),
                new Employee(3, "Alice", "IT", 85000),
                new Employee(4, "Bob", "Finance", 75000),
                new Employee(5, "Charlie", "HR", 65000),
                new Employee(6, "Emma", "Finance", 95000),
                new Employee(7, "Sophia", "IT", 90000),
                new Employee(8, "James", "Finance", 80000),
                new Employee(9, "Olivia", "HR", 70000),
                new Employee(10, "Michael", "IT", 75000)
        );

        // Sorted based on Salary...
        List<Employee> results = employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary)).toList();
        System.out.println(results);

        // Fetch list of sorted salaries in ascending order...
        List<Double> sortedSalaries = employees.stream().map(Employee::getSalary).sorted().toList();
        System.out.println(sortedSalaries);

        // Fetch list of sorted salaries in ascending order...
        List<Double> sortedSalariesRevers = employees.stream().map(Employee::getSalary).sorted(Comparator.reverseOrder()).toList();
        System.out.println(sortedSalariesRevers);

        // Fetch list of salaries greater than 70000 and sorted
        List<Double> salaries = employees.stream().map(Employee::getSalary).distinct()
                .filter(sal -> sal > 70000).sorted().toList();
        System.out.println(salaries);

        // Group by Department...
        Map<String, List<Employee>> employeesByDepartment = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println(employeesByDepartment);

        // Group by Department with count...
        Map<String, Long> employeesByDepartmentCount = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println(employeesByDepartmentCount);
    }
}
