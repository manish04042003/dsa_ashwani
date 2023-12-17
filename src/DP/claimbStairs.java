package DP;

public class claimbStairs {
    public static void main(String[] args) {

//        int ans = countClaimbStairs(4,0);
//        int ans = countClaimbStairswithjumps(10,new int[]{3,3,0,2,1,2,4,2,0,0});
//        int ans = miniJupms(10,new int[]{3,3,0,2,1,2,4,2,0,0});
        int[][] maze = new int[][]{{0, 1, 4 ,2 ,8 ,2},
            {4, 3, 6, 5 ,0, 4},
            {1 ,2 ,4 ,1 ,4 ,6},
            {2 ,0, 7, 3, 2, 2},
            { 3, 1, 5, 9, 2, 4},
            {2, 7, 0, 8 ,5 ,1}};

        Integer[][] memo = new Integer[maze.length][maze[0].length];


        int ans = mincostInMaze(maze,0,0,memo);

        System.out.println(ans);
    }



    private static int mincostInMaze(int[][] maze,int r,int c,Integer[][] memo) {
        int n = maze.length;
        int m = maze[0].length;
        if (r>=n || c >= m || r<0 || c<0){
            return Integer.MAX_VALUE;
        }

        if (r==n-1 && c==m-1){
            return maze[r][c];
        }
        if(memo[r][c]!=null){
            return memo[r][c];
        }

        int costForH = mincostInMaze(maze,r,c+1,memo);
        int costForV = mincostInMaze(maze,r+1,c,memo);


        if (costForV<costForH){
            memo[r][c] = costForV + maze[r][c];
            return costForV + maze[r][c];
        }else {
            memo[r][c] = costForH + maze[r][c];
            return costForH + maze[r][c];
        }
    }

    private static int miniJupms(int n, int[] arr) {
        int[] dp = new int[n+1];
        dp[n]=1;
        for (int i =n-1 ; i >=0 ; i --){
            for(int j = 1 ; j <= arr[i] ;j++){
                if (dp[i+j]!=0 && i+j<=n){
                    int c= 1+dp[i+j];
                    if(dp[i]>c || dp[i]==0){
                        dp[i]=c;
                    }
                }
            }
        }
        return dp[0]-1;

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
