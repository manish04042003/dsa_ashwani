package codingCom;

import java.util.Scanner;

public class mat {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][] m = new int[n][n];

        for (int i = 0 ; i < m.length; i++){
            for (int j =0 ; j < m.length ; j++){
                m[i][j] = sc.nextInt();
                System.out.print(m[i][j]);

            }

        }

//        int[][] m = {{1,2,3},{4,5,6},{9,8,9}};
        int dx = 0;
        int dy = 0 ;
        int j = m.length-1;
        for (int i = 0 ; i < m.length; i++,j--){
            dx = dx + m[i][i];
            dy = dy + m[i][j];
        }
        System.out.println(dx-dy);
    }
}
