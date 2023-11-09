package Recursion;

public class arrayRecursion {
    public static void main(String[] args) {
        int [] arr ={9,2,9,6,9,8,9,8,9,8};
//        printarr(arr,arr.length-
//        System.out.println(findmax(arr,0));

//        System.out.println(findindex(arr,0,10));


//        System.out.println(findlastindex(arr,arr.length-1, 9));

        int[] newarr = findAllIndex(arr,1,0,0);

        for (int i=0; i< newarr.length;i++){
            System.out.println(newarr[i]);
        }
    }

    private static int[] findAllIndex(int[] arr, int x, int i, int c) {
        if (i ==arr.length){
            return new int[c];
        }
        if (arr[i]==x){
            c++;
        }
        int[] ansarr = findAllIndex(arr,x,i+1,c);
        if (arr[i]==x){
            ansarr[c-1]=i;
        }
        return ansarr;
    }

    private static int findlastindex(int[] arr, int i, int x) {

        if (i == -1){
            return -1;
        }

        if (arr[i]==x){
            return i;
        }else {
            return findlastindex(arr,i-1,x);
        }
    }

    private static int findindex(int[] arr,int i,int x) {

        if (i== arr.length){
            return -1;
        }


        if (arr[i]==x){
            return i ;
        }else {
            int index = findindex(arr,i+1,x);
            return index;
        }

    }


    private static int findmax(int[] arr, int i, int x) {

        if (i == arr.length-1){
            return arr[i];
        }

        int max =findmax(arr,i+1, x);
        if (max > arr[i]){
            return max;
        }else {
            return arr[i];
        }
    }

    private static void printarr(int[] arr,int n) {
        if (n==-1){
            return;
        }
        printarr(arr,n-1);
        System.out.println(arr[n]);

    }
}
