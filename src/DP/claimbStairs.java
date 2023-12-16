package DP;

public class claimbStairs {
    public static void main(String[] args) {

//        int ans = countClaimbStairs(4,0);
//        int ans = countClaimbStairswithjumps(10,new int[]{3,3,0,2,1,2,4,2,0,0});

//        System.out.println(ans);
    }
    public static  int countClaimbStairswithjumps(int n, int[] arr){
        int[] table = new int[n +1];
        table[n] = 1;
        for (int i =n-1 ; i>=0;i--){
            int count = 0;
            for(int j =1 ; j<=arr[i];j++){
                if(i+j<table.length){
                    count = count+ table[i+j];
                }
            }
            table[i]=count;
        }
        return table[0];
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
