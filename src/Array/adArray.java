package Array;

public class adArray {
    public static void main(String[] args) {

        int[] arr = new int[5];
//        {10, 2, -2, -20, 10}, k = -10
        arr[0] = 10;
        arr[1] = 2;
        arr[2] = -2;
        arr[3] = -20;
        arr[4] = 10;


        int ans = subarraySum(arr,-10);
        System.out.println(ans);

    }

    static int subarraySum(int[] nums, int k) {
        int count = 0;
        for(int i = 0 ; i<nums.length; i++){
            int sum = nums[i] ;
            if(nums[i]==k) {
                count++;
            }
            for(int j = i+1 ; j<nums.length ; j++){
                sum = sum + nums[j];
                if(sum == k){
                    count ++ ;
                }
            }
        }

        return count;
    }
}
