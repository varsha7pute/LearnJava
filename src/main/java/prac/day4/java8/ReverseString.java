package prac.day4.java8;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello";

        String revStr= IntStream.range(0, str.length())
                .mapToObj(i -> str.charAt(str.length()-1-i))
                .map(String::valueOf)
                .collect(Collectors.joining());
        System.out.println("Reversed : "+revStr);
    }
}
