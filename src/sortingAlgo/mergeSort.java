package sortingAlgo;
import java.util.*;

public class mergeSort {

    public static void main(String[] args) {
        int[] arr = {98,4,54,6,6,32,21,65} ;
        divideandmerge(arr, 0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    
    public static  void  divideandmerge(int[] arr, int low, int high){
        if(low>=high){
            return;
        }
        int mid = (low+high)/2;
        divideandmerge(arr,low,mid);
        divideandmerge(arr,mid +1 ,high);
        merge(arr,low,mid,high);
    }

    public static void merge(int[] arr, int low, int mid, int high) {
        Vector<Integer> temp = new Vector<>();
        int left = low;
        int right = mid+1;
        while(left<=mid && right<=high){
            if (arr[left]<arr[right]){
                temp.addElement(arr[left]);
                left++;
            }else {
                temp.addElement(arr[right]);
                right++;
            }
        }

        while(left<= mid){
            temp.addElement(arr[left]);
            left++;
        }

        while(right<=high){
            temp.addElement((arr[right]));
            right++;
        }
        int j =0 ;
        for (int i = low ; i <= high; i++, j++){
            arr[i] = temp.get(j);
        }

    }

}
