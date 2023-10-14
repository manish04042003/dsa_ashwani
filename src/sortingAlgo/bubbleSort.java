package sortingAlgo;

import java.lang.reflect.Array;
import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {98,4,54,6,6,32,21,65};
        for (int i =1 ;i < arr.length; i++){
            for (int j = 1 ; j < arr.length; j++ ){
                if( arr[j-1]>arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
