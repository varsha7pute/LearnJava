package prac.day3.imp;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 7, 4, 4};

        Set<Integer> set= new LinkedHashSet<>();

        for(int i=0; i<arr.length-1; i++){
            set.add(arr[i]);
        }
        System.out.println(set);
    }
}
