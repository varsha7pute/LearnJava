package prac.day5.dsa;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortEmployeeObj {
    public record Employee(int id, String name, int salary){};

    public static void main(String[] args) {
        List<Employee> empList= Arrays.asList(
                new Employee(1, "Varsha", 7500),
                new Employee(2, "Vijay", 8000),
                new Employee(3, "Shiv", 6500));

        empList.sort(Comparator.comparing((Employee e)-> e.salary).thenComparing(e->e.name).reversed());

        empList.forEach(System.out::println);
    }
}
