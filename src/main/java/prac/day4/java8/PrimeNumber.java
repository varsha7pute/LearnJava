package prac.day4.java8;

import java.util.stream.IntStream;

public class PrimeNumber
{
    public static void main(String[] args) {
        int num= 29;

        boolean isPrime=num > 1 && IntStream.range(2, (int)Math.sqrt(num) + 1)
                .noneMatch(i -> num%i == 0);

        System.out.println(isPrime?"Prime":"Not Prime");
    }
}
