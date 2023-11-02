package Array;

import java.util.Scanner;

public class subsets {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
//        int n= scn.nextInt();
//        int[] arr = new int[n];
//        for (int i =0 ; i < n; i++){
//            arr[i]= scn.nextInt();
//        }

        int[] arr = {1,2,3};

        int limit = (int) Math.pow(2,arr.length);
        for (int i = limit; i > 0 ; i--){
            int temp = i ;
            String set = "";
            for (int j =arr.length-1 ; j >= 0 ; j--){
                int r= temp%2;
                temp = temp/2;
                if (r==0){
                    set = '-'+ set;
                }else{
                    set = arr[j] + set;
                }
            }
            System.out.println(set);

        }


    }
}
