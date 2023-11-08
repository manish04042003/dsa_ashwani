package Matrix;

public class exitPoint {
    public static void main(String[] args) {
//        0 1 1
//        1 0 1
//        1 1 1
//        0 0 1
        int[][] mat = {{0,1,1},{1,0,1},{1,1,1},{0,0,1}};
        int i = 0;
        int j =0;

        int dir = 0 ; //0-right    1-down    2-left     3-up

        while(i>=0 && i <mat.length && j >=0 && j <mat[0].length ){
            dir= (dir+ mat[i][j])%4 ;
            if (dir==0){
                j++;
            } else if (dir==1) {
                i++;
            } else if (dir==2) {
                j--;
            }else{
                i--;
            }
        }

        if (dir==0){
            j--;
        } else if (dir==1) {
            i--;
        } else if (dir==2) {
            j++;
        }else{
            i++;
        }

        System.out.println(""+i+","+j);

    }
}
