package prac.day6.iqa;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SumOfEvenOdd {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 5, 8, 1, 3, 2);
		Map<String, Integer> result = 
				 numbers.stream()
				.collect(Collectors.groupingBy(n -> n % 2 == 0 ? "Even" : "Odd", 
						Collectors.summingInt(n -> n)));

		System.out.println(result);
	}
}
