package Recursion;

public class TowerOfHonoi {
    public static void main(String[] args) {
        int n = 5 ;
        int a = 10;
        int b = 11;
        int c = 12;

        System.out.println(tower(n,a,b,c));
    }

    private static int tower(int n, int a, int b, int c) {
        if (n==0){
            return 0;
        }
        int s1 = tower(n-1,a,c,b);
//       System.out.println(""+ n + "["+ a+"->"+b+"]");
        System.out.println("move disk "+ n + " from rod "+ a+" to "+b);
       int s2 = tower(n-1,c,b,a);

        if (n==1){
            return 1;
        }

        return s1 + s2 + 1  ;
    }
}
