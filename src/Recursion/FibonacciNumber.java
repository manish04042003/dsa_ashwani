package Recursion;

public class FibonacciNumber {
    public static void main(String[] args) {
        int ans = fib(1);
        System.out.println(ans);
    }

    public static int fib(int n){
//        System.out.println(n);
        if(n==1){
            return 1;
        }else if(n<=0){
            return 0;
        }

        return fib(n-1) + fib(n-2);
    }
}
