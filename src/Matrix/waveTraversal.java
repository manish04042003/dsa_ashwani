package Matrix;

public class waveTraversal {
    public static void main(String[] args) {
        int[][] mat= {{2,3,4,5},{7,4,10,12},{12,34,24,45}};

        for (int j =0 ; j < mat[0].length; j++){
            if (j%2==0){
                for (int i =0 ; i < mat.length;i++){
                    System.out.println(mat[i][j]);
                }
            }else {
                for (int i = mat.length-1 ; i >=0;i--){
                    System.out.println(mat[i][j]);
                }
            }
        }


    }
}
