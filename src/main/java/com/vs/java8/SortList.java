package com.vs.java8;

import java.util.Scanner;

public class SortList {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string input");
        String str = sc.next().toLowerCase();

        //java 7
        int[] count = new int[2];
        char[] charStr = str.toCharArray();
        for (char ch : charStr) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
           // if("aeiou".indexOf(ch) != -1)
                count[0]++;
            else
                count[1]++;
        }
        System.out.println("Vowels = " + count[0] + " Consonants = " + count[1]);


        //using java8
        int[] cnt = new int[2];
        str.toLowerCase().chars().forEach(
                ch -> {
                    if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                    //if ("aeiou".indexOf(c) >= 0)
                        cnt[0]++;
                    else
                        cnt[1]++;
                });
        System.out.println("Vowels = " + cnt[0] + " Consonants = " + cnt[1]);
        System.out.println("Communication".toLowerCase());
    }
}