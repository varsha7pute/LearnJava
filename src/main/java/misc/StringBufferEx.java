package misc;

public class StringBufferEx {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("Java");
        StringBuffer sb2 = sb1;
        sb1.append("Programming");
        System.out.println(sb2);
    }
}
