package prac.day3.imp;

public class VowelConsonant {
    public static void main(String[] args) {
        String str = "hello world";
        int vowels = 0, consonant = 0;

        str = str.toLowerCase();

        for (char c : str.toCharArray()) {
            if (Character.isLetter(c))
                if ("aeiou".indexOf(c) != -1)
                    vowels++;
                else
                    consonant++;
        }
        System.out.println("Vowels = " + vowels);
        System.out.println("Consonant = " + consonant);
    }
}
