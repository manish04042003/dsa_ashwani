package Matrix;

public class exitPoint {
    public static void main(String[] args) {
        int[][] mat = {{0,0,0,1},{1,1,0,0},{0,1,0,0},{0,1,1,1}};
        int maxr = mat.length -1;
        int maxc = mat[0].length-1;
        int i = 0;
        int j =0;

        while(true){
            j++;
//            towards Right
            while(mat[i][j]==0){
                if (j==maxc){
                    System.out.print(" "+ i + ","+ j);
                    return;
                }
                j++;
            }
            i++;
//          towards  bottom
            while(mat[i][j]==0){
                if (i==maxr){
                    System.out.print(" "+ i + ","+ j);
                    return;
                }
                i++;
            }
            j--;
//          towards  left
            while(mat[i][j]==0){
                if (j==0){
                    System.out.print(" "+ i + ","+ j);
                    return;
                }
                j--;
            }
            i--;
//          towards  top
            while(mat[i][j]==0){
                if (i==0){
                    System.out.print(" "+ i + ","+ j);
                    return;
                }
                i--;
            }

        }

    }
}
