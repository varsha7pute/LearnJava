package prac.day2.imp;

import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int arr[] = {0, 1, 0, 2, 12};
        int result[] = new int[arr.length];

        int index = 0;
        for(int num : arr){
            if(num != 0)
                result[index++]=num;
        }
        System.out.println(Arrays.toString(result));
    }

}
