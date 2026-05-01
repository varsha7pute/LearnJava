package prac.day1;

public class SimpleCalculator {
    public static int add(int no1, int no2){
        return no1 + no2;
    }
    public static int sub(int no1, int no2){
        return no1 - no2;
    }
    public static int mul(int no1, int no2){
        return no1 * no2;
    }
    public static int div(int no1, int no2){
        return no1 / no2;
    }
    public static int mod(int no1, int no2){
        return no1 % no2;
    }

    public static void main(String[] args) {
        System.out.println("Addition of two numbers "+ add(10, 20));
        System.out.println("Substraction of two numbers "+ sub(10, 20));
        System.out.println("Multiplication of two numbers "+ mul(10, 20));
        System.out.println("Division of two numbers "+ div(10, 20));
        System.out.println("Modulus of two numbers "+ mod(11, 5));

    }
}
