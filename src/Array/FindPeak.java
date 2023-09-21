package Array;

public class FindPeak {
    public static void main(String[] args) {
        int[] nums = {1};

        int s= 0 ;
        int l = nums.length-1 ;
        int m = (l-s)/2;

        if (nums.length==1){
            System.out.println(nums[0]);
            return;
        }
        while(s<=l){
            System.out.print(s);
            System.out.print(m);
            System.out.println(l);

                if (m==0){
                    if (nums[m]>nums[m+1]){
                        System.out.println(m);
                        return;
                    }else {
                        System.out.println(m+1);
                        return;
                    }
                }
                if (m== nums.length-1){
                    if (nums[m]>nums[m-1]){
                        System.out.println(m);
                        return;
                    }else {
                        System.out.println(m-1);
                        return;
                    }
                }
                if (nums[m]>nums[m-1]){
                    if (nums[m]>nums[m+1]){
                            System.out.println(m);
                            return;
                    }else{
                            s = m +1;
                            m = s+ (l-s)/2;
                    }
                }else {
                    l= m-1 ;
                    m = s+ (l-s)/2;
                }
        }
        System.out.println("end");
    }
}
