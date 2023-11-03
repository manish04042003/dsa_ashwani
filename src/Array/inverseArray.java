package Array;

import java.util.Arrays;

public class inverseArray {
    public static void main(String[] args) {
        int[]  arr = {1,3,2,0};

        for (int i =0; i< arr.length;i++){
            for (int j=0 ; j<arr.length;j++){
                if (arr[j]==i){
                    arr[i]=j;
                }
            }
        }

        System.out.println(Arrays.toString(arr));

    }

}
