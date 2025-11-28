package com.cg.evaluation;

public class Evaluation1FindVowelsAndConsCountFromGivenString {
    public static void main(String[] args) {
        /* uncomment below code- if you want to get a input from user
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.next();*/

        String str = "Communication";
        int[] count = new int[2];
        //java8
        str.toLowerCase().chars().forEach(
                ch -> {
                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                        count[0]++;
                    else
                        count[1]++;
                }
        );
        System.out.println("java8 :: Vowel count = " + count[0] + " Consonant = " + count[1]);

        //java7
        String inputStr = "Communication";
        int[] cnt= new int[2];
        char[] charStr = inputStr.toLowerCase().toCharArray();
        for (char ch : charStr)
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                cnt[0]++;
            else
                cnt[1]++;

        System.out.println("java7 :: Vowel count = " + cnt[0] + " Consonant = " + cnt[1]);
    }
}
