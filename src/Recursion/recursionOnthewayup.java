package Recursion;

public class recursionOnthewayup {
    public static void main(String[] args) {
//        printSS("abc", "");
//        printkps("87","");
//        printStairPath(3,"");
//        PrintMazePath(1,1,3,5,"");
//        PrintMazePathWithJump(1,1,3,3,"");
//        PrintPermultation("abc","");
//        PrintEncoding("233");
//        margeString("manish","ish");
        productofarray();
    }

    private static void productofarray() {
        int[] nums = {2,34,5,2,0,3,0};
        int p = 1 ;
        int index = -1 ;
        int flag = 0;
        int[] ans = new int[nums.length];
        for(int i =0 ; i < nums.length ; i ++){
            if(nums[i]==0){
                index = i ;
                flag++;
            }
            p = p * nums[i];
        }

        if(flag == 1){
            ans[index] = nums[index];
        } else if (flag>1) {
            return;
        }
        for(int i =0 ; i < nums.length ; i ++){
            ans[i] = p/nums[i];
        }

    }

    private static void margeString(String word1, String word2) {
        StringBuilder ans = new StringBuilder();
        int n1 =  word1.length();
        int n2 = word2.length();
        for (int i =0 ; i < n1 || i< n2;i++){
               if (i< n1){
                   ans.append(word1.charAt(i));
               }
               if (i< n2){
                   ans.append(word2.charAt(i));
               }
        }

        System.out.println(ans);
    }

    private static void PrintEncoding(String number) {

    }

    private static void PrintPermultation(String str, String asf) {

        if (str.length()==0){
            System.out.println(asf);
        }
        for (int i=0; i< str.length();i++){
            PrintPermultation(str.substring(0,i)+str.substring(i+1),asf+str.charAt(i));
        }
    }


    private static void PrintMazePathWithJump(int sr, int sc, int dr, int dc, String ans) {

        if (sr>dr || sc>dc){
            return;
        }
        if (sr==dr && sc ==dc){
            System.out.println(ans);
            return;
        }

        for (int i =1 ; i <= dr-sr ; i++){
            PrintMazePathWithJump(sr+i,sc,dr,dc,ans + "v"+i);
        }
        for (int i =1 ; i <= dc-sc ; i++){
            PrintMazePathWithJump(sr,sc+i,dr,dc,ans + "h"+i);
        }

        for (int i =1 ; i <= dc-sc && i<= dr-sr ; i++){
            PrintMazePathWithJump(sr+i,sc+i,dr,dc,ans + "d"+i);
        }

    }


    private static void PrintMazePath(int sr, int sc, int dr, int dc, String ans) {
        if (sr==dr && sc == dc){
                System.out.println(ans);
                return;
        }
        if (sr>dr || sc > dc) {
            return;
        }


        PrintMazePath(sr+1,sc,dr,dc,ans+"v");
        PrintMazePath(sr,sc+1,dr,dc,ans+"h");

    }

    private static void printStairPath(int n, String path) {

        if (n==0){
            System.out.println(path);
            return;
        }

        if (n>=1){
            printStairPath(n-1,path + "1");
        }
        if (n>=2){
            printStairPath(n-2,path + "2");
        }
        if (n>=3){
            printStairPath(n-3,path + "3");
        }
    }

    private static void printkps(String str, String asf) {

        String[] keyboard = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vws","yz"};

        if (str.length()==0){
            System.out.println(asf);
            return;
        }
        int number = Integer.parseInt(String.valueOf(str.charAt(str.length()-1)));
        String btnstr = keyboard[number];
        for (int i =0 ; i < btnstr.length();i++){
            printkps(str.substring(0,str.length()-1),btnstr.charAt(i)+asf);
        }

    }

    private static void printSS(String abc, String s) {
        if(abc.length()==0){
            System.out.println(s);
            return;
        }
        printSS(abc.substring(1),s);
        printSS(abc.substring(1),s+abc.substring(0,1));

    }
}
