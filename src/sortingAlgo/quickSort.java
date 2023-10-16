package sortingAlgo;

import java.util.Arrays;

public class quickSort {
    public static void main(String[] args) {
        int[] arr = {98,4,54,6,6,32,21,65} ;
        quickShortfn(arr, 0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickShortfn(int[] arr, int low, int high) {
        if (low>=high){
            return;
        }
        int i = low;
        int j = high;
        int pvt = low;
        while (i<j){
            if (arr[i]>=arr[pvt]){
                if (arr[j]<arr[pvt]){
                   int temp = arr[j];
                   arr[j] = arr[i];
                   arr[i] = temp;
                   j=high;
                }else {
                    j--;
                }
            }else {
                i++;
            }
        }
        int temp = arr[i];
        arr[i] = arr[pvt];
        arr[pvt] = temp;

        quickShortfn(arr,low,i-1);
        quickShortfn(arr,i+1,high);
    }
}
