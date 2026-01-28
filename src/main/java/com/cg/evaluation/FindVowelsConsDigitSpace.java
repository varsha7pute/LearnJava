package com.cg.evaluation;

import java.util.Map;
import java.util.stream.Collectors;

class FindVowelsConsDigitSpace {

    public static void main(String[] args) {
        String str = "This website is aw3som3.";

        // Count all character types in one pass using a single Map variable
        Map<String, Long> counts = str.toLowerCase().chars()
            // Map each char (int) to a String category name using a complex inline lambda
            .mapToObj(ch -> {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                    return "Vowels";
                 else if (ch >= 'a' && ch <= 'z')
                    return "Consonants";
                 else if (ch >= '0' && ch <= '9')
                    return "Digits";
                 else if (ch == ' ')
                    return "White spaces";
                 else
                    return "Other";
            })
            // Collect the results into a Map
            .collect(Collectors.groupingBy(
                categoryName -> categoryName, // Group by the category name
                Collectors.counting()        // Count occurrences in each group
            ));



        System.out.println("Vowels: " + counts.getOrDefault("Vowels", 0L));
        System.out.println("Consonants: " + counts.getOrDefault("Consonants", 0L));
        System.out.println("Digits: " + counts.getOrDefault("Digits", 0L));
        System.out.println("White spaces: " + counts.getOrDefault("White spaces", 0L));
        System.out.println("Other: " + counts.getOrDefault("Other", 0L));
    }
}
