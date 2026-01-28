package misc;

public class StringImmutable
{
    public static void main(String[] args)
    {
        String s = "Varsha";
        // concat() method appends the string at the end
        s.concat(" Satpute");
        // This will print Varsha because strings are immutable objects
        System.out.println(s);

        /*//This the reason we need new String(-),
        which cant achieved with the help of String literal*/
        char[] ch= {'J','A','V','A'};
        String str = new String(ch);

        System.out.println(str);
    

    }
}