package Matrix;

public class SearchInSortedMatrix {
    public static void main(String[] args) {
        int[][] mat = {{11,12,13,14,15,16,17},{21,22,23,24,25,26,27},{31,32,33,34,35,36,37},{41,42,43,44,45,46,47},{51,52,53,54,55,56,57}};
        int tar = 11;
        int i =0 ;
        int j =mat[0].length-1;

        while(i< mat.length && j >=0 ){
            if (tar>mat[i][j]){
                i++;
            } else if (tar<mat[i][j]) {
                j--;
            }else {
                System.out.println("" + i +","+j);
                return;
            }
        }

        System.out.println("Element Not Found");
    }
}
