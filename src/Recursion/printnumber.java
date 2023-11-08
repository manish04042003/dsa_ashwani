package Recursion;

public class printnumber {
    public static void main(String[] args) {
        int n = 9 ;
//        printdicreesing(n);

//        printincreesing(9);
//        printdicressingincreassing(n);

//        System.out.println(factorial(n));

        System.out.println(power(10,8));

    }

    private static int power(int x , int n){
        if (n==0){
            return 1;
        }
        int xpnb2 = power(x,n/2);
        int xpn = xpnb2*xpnb2;

        if (n%2!=0){
            xpn=xpn*x;
        }

        return xpn;
    }

    private static int factorial(int n) {
        if (n ==1){
            return 1;
        }

        return n*factorial(n-1);
    }

    private static void printdicreesing(int n) {
        if (n==0){
            return;
        }
        System.out.println(n);
        printdicreesing(n-1);
    }

    private  static  void printincreesing(int n){
        if (n==0){
            return;
        }
        printincreesing(n-1);
        System.out.println(n);
    }

    private static  void printdicressingincreassing(int n){
        if (n ==0){
            return;
        }
        System.out.println(n);
        printdicressingincreassing(n-1);
        System.out.println(n);
    }
}
