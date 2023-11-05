package Matrix;

public class ninetydegreeRotate {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

//        transvarce the matrix
        for (int i =0 ,j =0 ; i < mat.length ; i++,j++){
            for (int x =i+1 ; x< mat.length ; x++ ){
                int temp = mat[x][j];
                mat[x][j] = mat[j][x];
                mat[j][x]= temp;
            }
        }

//        swap the colomn
        int minc = 0 ;
        int maxc = mat.length-1;

        while(minc<maxc){
            for (int i =0 ; i < mat.length ; i ++){
                int temp = mat[i][minc];
                mat[i][minc] = mat[i][maxc];
                mat[i][maxc]= temp;
            }
            minc++;
            maxc--;
        }



        for( int i =0 ; i < mat.length; i++){
            for (int j =0 ; j < mat.length ; j++){
                System.out.print(" "+ mat[i][j] );
            }
            System.out.println();
        }

    }
}
