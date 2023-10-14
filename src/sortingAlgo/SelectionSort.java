package sortingAlgo;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {98,4,54,6,6,32,21,65};

        for(int i =0 ; i < arr.length-1 ;i++){
            int min = i;
            for (int j =i ; j < arr.length; j++){
                if(arr[j]<arr[min]){
                  min = j;
                }
            }

            swap(min,i,arr);
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int min, int i,int[] arr){
        int temp = arr[min];
        arr[min]= arr[i];
        arr[i] = temp;
    }

}


