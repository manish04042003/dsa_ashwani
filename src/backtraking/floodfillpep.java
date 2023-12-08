package backtraking;

public class floodfillpep {
    public static void main(String[] args) {
        int[][] arr = {{0,1,0,0,0,0,0},{0,1,0,1,1,1,0},{0,0,0,0,0,0,0},{1,0,1,1,0,1,1},{1,0,1,1,0,1,1},{1,0,0,0,0,0,0}};

        boolean[][] visited = new boolean[arr.length][arr[0].length];
        floodfill(arr,0,0,"",visited);
    }

    private static void floodfill(int[][] mat, int row, int col, String asf, boolean[][] visited) {
        if (row<0 || col<0 || col == mat[0].length || row == mat.length || mat[row][col] == 1  || visited[row][col]){
            return;
        }
        if (row==mat.length-1 && col == mat[0].length-1){
            System.out.println(asf);
            return;
        }

        visited[row][col] = true;
        floodfill(mat,row-1,col,asf+"t",visited);
        floodfill(mat,row,col-1,asf+"l",visited);
        floodfill(mat,row+1,col,asf+"d",visited);
        floodfill(mat,row,col+1,asf+"r",visited);
        visited[row][col]= false;

    }
}
