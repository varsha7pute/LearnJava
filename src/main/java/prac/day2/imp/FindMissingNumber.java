package prac.day2.imp;

public class FindMissingNumber {
    public static void main(String[] args) {

        int[] arr = {1,3,4,5};
        int n = 5;
        int expected = 0;
        int actual = 0;

        for(int i = 1; i<=n; i++){
            expected = expected + i;
        }

        for(int num : arr){
            actual = actual + num;
        }

        System.out.println("Missing: "+ (expected - actual));
    }
}
