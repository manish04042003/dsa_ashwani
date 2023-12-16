package DP;

public class claimbStairs {
    public static void main(String[] args) {

        int ans = countClaimbStairs(4,0);
        System.out.println(ans);
    }
    public  static int countClaimbStairs(int n,int s){

        if (s==n){
            return 1;
        } else if (s>n) {
            return 0;
        }

        int one = countClaimbStairs(n,s+1);
        int two = countClaimbStairs(n,s+2);
        int three = countClaimbStairs(n,s+3);

        return one + two + three;
    }
}
