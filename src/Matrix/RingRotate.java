package Matrix;

public class RingRotate {
    public static void main(String[] args) {
        int[][] mat = {{11,12,13,14,15,16,17},{21,22,23,24,25,26,27},{31,32,33,34,35,36,37},{41,42,43,44,45,46,47},{51,52,53,54,55,56,57}};
        int s=1;
        int r=3;

        int minc = s-1;
        int maxc = mat[0].length-s;
        int minr = s-1;
        int maxr = mat.length-s;
        int index = 0;


        System.out.println(" "+maxc+","+maxr);
            int ftemp = mat[minr][minc];
//            right
            for (int i =minr , j = minc ; j< maxc;j++){
                System.out.println(mat[i][j]);
            }
            System.out.println("-------------");
            for (int i =minr , j = maxc ; i< maxr;i++){
                System.out.println(mat[i][j]);
            }
            System.out.println("--------------");
            for (int i =maxr , j = maxc ; j> minc;j--){
                System.out.println(mat[i][j]);
            }
            System.out.println("-----------");
            for (int i =maxr , j = minc ; i>minr ;i--){
                System.out.println(mat[i][j]);
            }
            System.out.println("-------------");


//        }
    }
}
