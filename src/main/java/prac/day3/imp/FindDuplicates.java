package prac.day3.imp;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr={1,2,3,2,4,4,6,6,3,5};
        Set<Integer> set=new HashSet<>() ;
        for(int n : arr){
            if(!set.add(n)){
                System.out.println("duplicate ele "+n);
            }
        }
    }

}
