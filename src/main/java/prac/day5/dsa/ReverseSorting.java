package prac.day5.dsa;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseSorting {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 5, 8, 1,3,2);

        numbers.sort(Collections.reverseOrder());

        System.out.println(numbers);
    }
}
