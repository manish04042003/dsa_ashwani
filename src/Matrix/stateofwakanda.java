package Matrix;

public class stateofwakanda {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        for (int startj = 0 ; startj<mat.length; startj++ ) {
            for (int i = 0, j = startj; j < mat.length; i++, j++) {
                System.out.println(mat[i][j]);
            }
        }

    }
}
