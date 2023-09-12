package Array;

public class removeEelement {
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        int k =0 ;
        for(int i =0 ; i < nums.length ; i++){
            if(nums[i]==val){
                k++;
            }else{
                nums[i-k]=nums[i];
            }
        }

        for (int i =0 ; i < nums.length  ; i++){
            System.out.print(nums[i]);
        }
    }
}
