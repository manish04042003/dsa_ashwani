package Matrix;

public class spiralTravarsal {
    public static void main(String[] args) {
        int[][] mat = {{2,3,4,4},{3,6,7,8},{3,6,7,9},{3,6,7,8},{3,6,7,8}};

        int minr = 0 ;
        int minc = 0 ;
        int maxr = mat.length -1;
        int maxc = mat[0].length -1;
        int count = 0 ;
        int telement = mat.length*mat[0].length;

        while (count<=telement){
//          leftwall
            for (int i =minr,j=minc ; i <= maxr && count<=telement ; i++ ){
                System.out.print(" "+ i + ","+ j);
                System.out.println();
                count++;
            }

            minc++;

            System.out.println("------------");

//           bottom wall
            for (int i = maxr,j=minr; j < maxr &&count<=telement ;j++){
                System.out.print(" "+ i + ","+ j);
                System.out.println();
                count++;
            }
            maxr--;

            System.out.println("------------");

//          right wall
            for (int i = maxr,j=maxc ; i >=minr && count<=telement;i--){
                System.out.print(" "+ i + ","+ j);
                System.out.println();
                count++;
            }
            maxc--;

            System.out.println("------------");

//          top wall
            for (int i = minr,j=maxc ; j >=minc && count<=telement;j--){
                System.out.print(" "+ i + ","+ j);
                System.out.println();
                count++;
            }

            minc++;

            System.out.println("------------");
        }

    }
}
