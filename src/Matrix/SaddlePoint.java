package Matrix;

public class SaddlePoint {
    public static void main(String[] args) {
//        given you the matrix and you have to find the element which is least in row and max in its column
        int[][] mat = {{11,12,13,14,15,16,17},{21,22,23,24,25,26,27},{31,32,33,34,35,36,37},{41,42,43,44,45,46,47},{51,52,53,54,55,56,57}};

        for (int i =0 ; i < mat.length ; i++){
            int mini = i;
            int minj = 0;
//            find min in row
            for(int j =0 ; j < mat[0].length;j++){
               if (mat[i][j]<mat[mini][minj]){
                   mini = i ;
                   minj = j;
               }
            }
//            System.out.println(mat[mini][minj]);
            int flag = 0 ;
//            check if it is max in partcular col
            for (int x = 0 ; x < mat.length && flag==0; x++){
                if (mat[x][minj]>mat[mini][minj]){
                    flag = 1;
                }
            }

            if (flag == 0){
                System.out.println(mat[mini][minj]);
                return;
            }

        }

        System.out.println("No saddle Point");
    }
}
