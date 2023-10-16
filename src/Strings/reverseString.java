package Strings;

public class reverseString {
    public static void main(String[] args) {
        String s = "            ";
        String str = GiveMeAFirstWord(s);
        System.out.println(str);

    }

    public static String GiveMeAFirstWord(String s) {

        while(s.charAt(0)==' ' && s.length()>0){
            s= s.substring(1,s.length());
            if (s.length() == 0 ){
                return "";
            }
        }
        while(s.charAt(s.length()-1)==' ' && s.length()>0 ){
            s= s.substring(0,s.length()-1);
            if (s.length() == 0 ){
                return "";
            }
        }

        if (s.indexOf(" ") == -1){
            return s;
        }


        String First = "";
        if (s.indexOf(" ")+1< s.length()){
            First =  GiveMeAFirstWord(s.substring(s.indexOf(" ")+1,s.length()));
        }
//        System.out.println(First);
       return First + " " + s.substring(0,s.indexOf(" "));

    }
}
