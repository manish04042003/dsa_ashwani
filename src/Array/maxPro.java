package Array;

public class maxPro {
    public static void main(String[] args) {
       int[] nums = {-7,-2,-4};
       int p = nums[0];
       int maxp = nums[0];
       if (nums.length == 1){
           System.out.println(p);
           return;
       }
       for (int i =1 ; i< nums.length ; i++){
           if(p<0 && nums[i]>0){
               if (maxp<nums[i]){
                   maxp = nums[i];
               }
               p = nums[i]*p;

           }else {
              if (maxp<nums[i]*p){
                  p = nums[i]*p;
              }else {
                  if(p==0){
                      p = nums[i];
                  }else{
                      p = p*nums[i];
                  }
              }
           }
           if (maxp<p) {
               maxp = p ;
           }
       }
        System.out.println(maxp);
    }
}
