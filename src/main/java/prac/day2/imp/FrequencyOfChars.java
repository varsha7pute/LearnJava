package prac.day2.imp;

public class FrequencyOfChars {
    public static void main(String[] args) {
        String str = "banana";

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            int count=0;

            for(int j=0; j<str.length(); j++){
                if (str.charAt(j) == ch)
                        count++;
            }
            System.out.println(ch + "="+count);

        }
    }
}
