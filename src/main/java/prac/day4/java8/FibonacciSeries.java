package prac.day4.java8;

import java.util.stream.Stream;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n=10;

        Stream.iterate(new int[]{0,1}, t -> new int[]{t[1],t[0]+t[1]})
                .limit(n)
                .map(t -> t[0])
                .forEach(x -> System.out.println(x + " "));
    }
}
