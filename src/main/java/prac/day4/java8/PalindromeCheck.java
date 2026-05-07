package prac.day4.java8;

import java.util.stream.IntStream;

public class PalindromeCheck {
    public static void main(String[] args) {
        String str="madam";

        boolean isPalindrome = IntStream.range(0, str.length()/2)
                .allMatch(i -> str.charAt(i)==str.charAt(str.length()-1-i));
        System.out.println(isPalindrome?"Palindrome":"Not Palindrome");
    }
}
