package prac.day6.iqa;

import java.util.stream.IntStream;

public class ReverseInputString {
	
	public static void main(String args[]) {
		String str="Good Morning";
		
        String reversed = IntStream.rangeClosed(1, str.length())
                .mapToObj(i -> str.charAt(str.length() - i))
                .map(String::valueOf)
                .reduce("", (a, b) -> a + b);

        System.out.println(reversed); 
	}

}
