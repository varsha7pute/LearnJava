package com.cg.evaluation;

import java.util.stream.Collectors;

public class MorganEvaUniqueChar {

    String str = "Happy New Year";
   // Output :: "Hapy new yr"

    public static void main(String[] args) {
        String input = "Happy New Year";
        String output= input.chars().distinct()
                        .mapToObj(c -> String.valueOf((char)c))
                                .collect(Collectors.joining());
        System.out.println(output);
    }

}
