package prac.day4.java8;

import java.util.Arrays;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr={0, 25, 5, 40, 15};

        int max= Arrays.stream(arr).max().orElseThrow();

        System.out.println("Largest: "+max);
    }
}
