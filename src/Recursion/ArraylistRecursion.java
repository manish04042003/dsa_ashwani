package Recursion;

import java.sql.Array;
import java.util.ArrayList;

public class ArraylistRecursion {
    public static void main(String[] args) {

//        ArrayList<String> arrstr = getSS("abc");
//        System.out.println(arrstr);

//        ArrayList<String> ans = getKPC("234");
//        System.out.println(ans);


//        ArrayList<String> ans = possibleWords(new int[]{2, 3, 4}, 3);
//        System.out.println(ans);

//        ArrayList<String> ans = getStairPath(5);
//        System.out.println(ans);

//        int ans = climbStair(84);
//        System.out.println(ans);


//        ArrayList<String> ans = getMazepath(1,1,2,2);
//        System.out.println(ans);



    }

    private static ArrayList<String> getMazepath(int sr, int sc, int dc, int dr) {

        if (sr>dr || sc>dc){
            ArrayList<String> forr = new ArrayList<>();
            return forr;
        }
        if (sr==dr && sc==dc){
            ArrayList<String> endcase = new ArrayList<>();
            endcase.add("");
            return endcase;
        }

//        if (sr==dr-1 && sc==dc){
//            ArrayList<String> endcase = new ArrayList<>();
//            endcase.add("v");
//            return endcase;
//        }
//        if (sr==dr && sc==dc-1){
//            ArrayList<String> endcase = new ArrayList<>();
//            endcase.add("h");
//            return endcase;
//        }

        ArrayList<String> forv = getMazepath(sr,sc+1,dc,dr);
        ArrayList<String> forh = getMazepath(sr+1,sc,dc,dr);

        ArrayList<String> ans = new ArrayList<>();

        for (String s : forv){
            ans.add("v"+s);
        }
        for (String s : forh){
            ans.add("h"+s);
        }

        return ans;


    }

    private static int climbStair(int n) {

        if(n==1){
            return 1;
        } else if (n==2) {
            return 2;
        }
        int First = climbStair(n-1);
        int second = climbStair(n-2);
        return First + second ;
    }

    private static ArrayList<String> getStairPath(int n) {

        if(n==1){
            ArrayList<String> forone = new ArrayList<>();
            forone.add("1");
            return forone;
        } else if (n==2) {
            ArrayList<String> fortwo = new ArrayList<>();
            fortwo.add("2");
            fortwo.add("11");

            return fortwo;
        }
         ArrayList<String> First = getStairPath(n-1);
        ArrayList<String> second = getStairPath(n-2);

        ArrayList<String> ans = new ArrayList<>();
        for (String s : First){
             ans.add("1"+s);
        }
        for (String s : second){
            ans.add("2"+s);
        }

        return ans ;


    }

    private  static  ArrayList<String> possibleWords(int[] a,int n){
        String[] arr = {"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        if (n==1){
            ArrayList<String> forone = new ArrayList<>();
            String cs = arr[a[0]];
            for (int i =0 ; i < cs.length(); i++ ){
                forone.add(""+cs.charAt(i));
            }
            return forone ;
        }

        ArrayList<String> ansList = possibleWords(a,n-1);
        ArrayList<String> newlist = new ArrayList<>();

        for (String s : ansList){
            for (int i =0 ; i < arr[a[n-1]].length();i++){
                newlist.add(s+arr[a[n-1]].charAt(i));
            }
        }
        return newlist;
    }
    private static ArrayList<String> getKPC(String number) {

        String[] arr = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vws","yz"};
        if (number.length()==1){
            ArrayList<String> forone = new ArrayList<>();
            String cs = arr[Integer.parseInt(number)];
            for (int i =0 ; i < cs.length(); i++ ){
                forone.add(""+cs.charAt(i));
            }
            return forone ;
        }

        ArrayList<String> ansList = getKPC(number.substring(0,number.length()-1));
        ArrayList<String> newlist = new ArrayList<>();

        for (String s : ansList){
            for (int i =0 ; i < arr[Integer.parseInt(number.substring(number.length()-1))].length();i++){
                newlist.add(s+arr[Integer.parseInt(number.substring(number.length()-1))].charAt(i));
            }
        }
        return newlist;
    }

    private static ArrayList<String> getSS(String s) {
        if (s.length()==1){
            ArrayList<String> forone = new ArrayList<String>();
            forone.add("");
            forone.add(s);
            return forone ;
        }
        ArrayList<String> newarrylist =getSS(s.substring(0,s.length()-1));
        int lenth = newarrylist.size();
        for (int i = 0 ; i<lenth;i++){
            newarrylist.add(newarrylist.get(i)+s.charAt(s.length()-1));
        }
        return newarrylist ;
    }
}
