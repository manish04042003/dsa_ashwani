package Array;

import java.util.Scanner;

//Find the maximum number in java
public class largestele {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();

        int arr[] = new int[l];
        System.out.println("---------------");
        for(int i=0; i<l ;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("---------------");

//        int ans = max_num(arr);
//        System.out.println(ans);

//        String scondLast = second_last_max_num(arr);
//        System.out.println(scondLast);

        int[] revans = reverse(arr);

        for (int i =0 ;i< revans.length;i++){
            System.out.println(revans[i]);
        }

    }

    static int max_num(int[] arr){

        int lar = arr[0];
        for (int i =0 ; i< arr.length; i++){
            if (lar< arr[i]){
                lar = arr[i];
            }
        }
        return lar;
    }

    static String second_last_max_num(int[] arr){
        int lar = Integer.MIN_VALUE;
        int slar = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int smin = Integer.MAX_VALUE;
        for (int i =0 ; i< arr.length; i++){
//            2,5,1,9,7
            if (lar< arr[i]){
                slar = lar;
                lar = arr[i];
            }
            if (lar>arr[i] && slar<arr[i]){
                slar = arr[i];
            }

            //for minum values
            if (min> arr[i]){
                smin = min;
                min = arr[i];
            }
            if (min<arr[i] && smin>arr[i]){
                smin = arr[i];
            }
        }
        return "" + min +','+ smin + ','+ slar+','+lar;
    }


    static int[] reverse(int[] arr){
        int i = 0;
         while(i < (arr.length/2)){
            int temp = arr[arr.length-i-1] ;
            arr[arr.length-i-1] = arr[i];
            arr[i] = temp;
            i++;
         }

        return arr;
    }

}
