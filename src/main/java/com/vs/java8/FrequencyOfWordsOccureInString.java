package com.vs.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyOfWordsOccureInString {

    public static void main(String[] args) {
        String str = "This is the my Life and this lifE is good";
        List<String> strArray = List.of(str.split(" "));
        Map<String, Long> freMap = strArray.stream()
                .collect(Collectors.groupingBy(name -> name.toLowerCase(), Collectors.counting()));
        System.out.println(freMap);
    }
}
