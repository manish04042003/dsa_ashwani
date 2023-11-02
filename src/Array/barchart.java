package Array;

public class barchart {
    public static void main(String[] args) {
        int[] arr = {2,4,0,3,1};
        int max = arr[0];
        for (int i =1 ; i < arr.length ; i ++){
            if (max<arr[i]){
                max = arr[i];
            }
        }

        for (int i =max ; i > 0; i --){
            for (int j =0 ; j < arr.length ; j ++){
                if (arr[j]>=i){
                    System.out.print(" * ");
                }else {
                    System.out.print(" - ");
                }
            }
            System.out.println("");
        }

    }
}
