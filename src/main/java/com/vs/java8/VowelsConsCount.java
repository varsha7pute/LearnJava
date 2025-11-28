package com.vs.java8;

import java.util.Scanner;

public class VowelsConsCount{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string input");
        String str = sc.next();
        char[] charStr = str.toLowerCase().toCharArray();
        int[] count = new int[2];
        for(char ch : charStr){
            //if("aeiou".indexOf(ch) != -1)
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                count[0]++;
            else
                count[1]++;
        }
        System.out.println("Vowels = "+ count[0] + " Consonants = "+ count[1]);

        System.out.println("============JAVA8==================");
        int[] newCount =new int[2];
        str.toLowerCase().chars().forEach(ch->{
                    if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                        newCount[0]++;
                    else
                        newCount[1]++;
                }
        );
        System.out.println("Vowels = "+ newCount[0] + " Consonants = "+ newCount[1]);
    }
}