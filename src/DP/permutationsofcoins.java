package DP;

public class permutationsofcoins {
    public static void main(String[] args) {
        int[] arr = {2,3,5,6};
        int amt = 7;
        int[] dp = new int[amt+1];
        dp[0]=1;
        for (int i =0 ; i <= amt ; i ++){
            for (int j=0 ; j< arr.length ; j ++){
                if (arr[j]<= i){
                    if(dp[i-arr[j]]>0){
                        dp[i]= dp[i]+dp[i-arr[j]];
                    }
                }
            }
        }

        System.out.println(dp[amt]);
    }
}
