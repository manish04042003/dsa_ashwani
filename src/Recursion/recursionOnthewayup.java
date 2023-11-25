package Recursion;

public class recursionOnthewayup {
    public static void main(String[] args) {
//        printSS("abc", "");
//        printkps("87","");
//        printStairPath(3,"");
//        PrintMazePath(1,1,3,5,"");
//        PrintMazePathWithJump(1,1,3,3,"");
        PrintPermultation("abc","");

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
