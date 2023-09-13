package TwoDArray;

public class ValidSudoku {
    public static void main(String[] args) {
        char[][] mat = {{'.','.','.','.','5','.','.','1','.'},
                        {'.','4','.','3','.','.','.','.','.'},
                        {'.','.','.','.','.','3','.','.','1'},
                        {'8','.','.','.','.','.','.','2','.'},
                        {'.','.','2','.','7','.','.','.','.'},
                        {'.','1','5','.','.','.','.','.','.'},
                        {'.','.','.','.','.','2','.','.','.'},
                        {'.','2','.','9','.','.','.','.','.'},
                        {'.','.','4','.','.','.','.','.','.'}};
        for(int i =0 ; i < 9; i ++){
            for (int j =0 ; j < 9 ; j++){
                if(mat[i][j]!='.'){
                    if (!checkbox(i,j,mat,mat[i][j])){
                        System.out.println("False");
                        return ;
                    }
                    if(!checkrowandcol(i,j,mat,mat[i][j])){
                        System.out.println(mat[i][j]);
                        System.out.println("False");
                        return ;
                    }
                }
            }
        }
        System.out.println("True");
    }

    public static boolean checkbox(int x,int y , char[][]mat , char val ) {

        int xstart = 0 ;
        int ystart = 0 ;
        if(x<=2){
            xstart = 0;
        } else if (x<=5) {
            xstart = 3;
        }else {
            xstart = 6;
        }
        if (y<=2){
            ystart = 0;

        } else if (y<=5) {
            ystart = 3;
        }else {
            ystart = 6 ;
        }
        for (int i = xstart; i <= xstart+2; i++) {
                for (int j = ystart ; j <= ystart+2 ; j ++ ){
                    if (i!=x && j!= y){
                        if (mat[i][j] == val){
                            return false;
                        }
                    }
                }
        }
        return true;
    }

    public static boolean checkrowandcol(int x,int y , char[][]mat,char val){
        for (int i = 0 ; i< 9 ; i++){
            if (i!=y){
                if(mat[x][i]==val){
                    return false;
                }
            }
            if (i!=x){
                if (mat[i][y]==val){
                    return false ;
                }
            }

        }
        return true ;
    }
}
