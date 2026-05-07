package prac.day5.dsa;

public class BubbleSorting {
    public static void main(String[] args) {
        int[] arr={64,2,24, 35, 57,65};
        int n = arr.length;

        //Bubble sort logic
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        //print sorted arr
        System.out.println("Sorted arr");
        for(int num:arr)
            System.out.println(num+" ");
    }
}
