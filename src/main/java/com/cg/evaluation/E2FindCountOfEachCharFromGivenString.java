package com.cg.evaluation;


import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class E2FindCountOfEachCharFromGivenString {

    public static void main(String[] args) {
        String givenInput = "String data to count each character";

        char[] charStr= givenInput.toCharArray();

        Map<Character, Long> frequencyMap=givenInput.toLowerCase()
                .chars()
                .mapToObj( ch -> (char) ch)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        frequencyMap.forEach((k, v)-> System.out.print(v +":" + k ));


    }


    /* Write a program to print the count of each character in a String?
Example : Input String is "String data to count each character" Then output :
{s=1, t=5, r=3, i=1, n=2, g=1, =5, d=1, a=5, o=2, c=4, u=1, e=2, h=2}*/
}
