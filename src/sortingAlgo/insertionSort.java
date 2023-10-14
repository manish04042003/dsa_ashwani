package sortingAlgo;

import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr = {98,4,54,6,6,32,21,65} ;
        for( int i =1 ; i < arr.length ; i++){
            int j = i ;
            while( j>0 && arr[j-1]>arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                 j -- ;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
