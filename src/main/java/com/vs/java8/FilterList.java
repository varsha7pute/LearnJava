package com.vs.java8;

import java.util.List;
import java.util.Scanner;

public class FilterList {

    public static void main(String[] args) {
        List<String> list= List.of("apple", "banana", "kivi", "orange", "pineapple", "mango");

        //search k element
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter string to search :");
        String search = sc.next();
        list.stream()
                .filter(s -> s.equals(search)).forEach(System.out::println);

        System.out.println("======================================");
        list.stream().sorted().forEach(System.out::println);

            }
}
