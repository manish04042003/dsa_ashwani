package Recursion;

import java.util.ArrayList;

public class ArraylistRecursion {
    public static void main(String[] args) {

//        ArrayList<String> arrstr = getSS("abc");
//        System.out.println(arrstr);

//        ArrayList<String> ans = getKPC("234");
//        System.out.println(ans);


        ArrayList<String> ans = possibleWords(new int[]{2, 3, 4}, 3);
        System.out.println(ans);

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
