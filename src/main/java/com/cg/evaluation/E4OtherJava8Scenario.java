package com.cg.evaluation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class E4OtherJava8Scenario {
    /*
Given a list of strings representing names:
["Alice", "Bob", "Charlie", "David", "Eve", "Frank"]

-> Use Stream API and Lambda expressions to:
-> Filter names that start with a vowel.
-> Convert them to uppercase.
-> Sort them alphabetically.
-> Collect the result into a list and print it
    */

    public static void main(String[] args) {
        // Original list of names
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve", "Frank");

        // Process the list using Java 8 Stream API
        List<String> result = names.stream()
                // 1. Filter names that start with a vowel (A, E, I, O, U)
                // Simplified and more readable line using a regular expression:
                .filter(name -> name.matches("^[AEIOUaeiou].*"))

                // 2. Convert them to uppercase
                .map(String::toUpperCase)

                // 3. Sort them alphabetically
                .sorted()

                // 4. Collect the result into a new List
                .collect(Collectors.toList());

        // Print the final result
        System.out.println("Original names: " + names);
        System.out.println("Processed names (vowel start, uppercase, sorted): " + result);
    }
}
