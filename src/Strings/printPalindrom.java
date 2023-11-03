package Strings;

public class printPalindrom {
    public static void main(String[] args) {
        String s = "abccbc";

        for (int i =0 ; i < s.length(); i++){
            for (int j =i+1 ; j <= s.length();j++){
                if (checkpalindrom(s.substring(i,j))){
                    System.out.println(s.substring(i,j));
                }
            }
        }
    }


    public static boolean checkpalindrom (String s) {
        for (int i =0 ; i<s.length()/2;i++){
            if (s.charAt(i)!=s.charAt(s.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}
