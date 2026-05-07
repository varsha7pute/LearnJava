package prac.day5.dsa;

import java.util.Arrays;
import java.util.List;

public class SortArrayElements {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("Varsha", "Vijay", "Om", "Priya", "Aarya");

        List<String>  sortedNames= names.stream()
                .sorted()
                .toList();

        System.out.println(sortedNames);
    }
}
