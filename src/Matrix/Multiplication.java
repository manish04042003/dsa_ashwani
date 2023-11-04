package Matrix;

import java.util.Arrays;

public class Multiplication {
    public static void main(String[] args) {
        int[][] mat1 = {{2,3,4},{3,6,7}};
        int[][] mat2 = {{2,3,4},{3,6,7},{3,6,7}};

        int r = mat1.length;
        int c = mat2[0].length;

        if (mat1[0].length != mat2.length){
            System.out.println(" this array cannot be  multiplied");
            return;
        }

        int [][] newmat = new int[r][c];

        for (int i =0 ; i < mat1.length; i++){
            for (int j =0 ; j < mat2[0].length;j++){
                int ans =0;
                for (int n = 0 ;n <mat1.length; n++ ){
                    ans = ans + mat1[i][n]*mat2[j][n];
                }
                newmat[i][j] = ans;
            }
        }

        for (int i =0 ; i < mat1.length; i++){
            for (int j =0 ; j < mat2[0].length;j++){
                System.out.print(newmat[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println();




    }
}
