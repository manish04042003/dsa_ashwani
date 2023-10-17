package Strings;

public class prefix {
    public static void main(String[] args) {
        String[] str = {"flower",""};
        String s1 = str[0];
        for (int i =1 ; i <str.length; i++){
            s1 = givePrefix(s1,str[i]);
            if (s1==""){
                break;
//                return "";
            }
        }
        System.out.println(s1);
    }

    public static String givePrefix(String s1,String s2){
        int j =0;
        while(s1.length()>j && s2.length()>j){
            if(s1.charAt(j)==s2.charAt(j)){
                j++;
            }else{
                return s1.substring(0,j);
            }
        }
        return s1.substring(0,j);
    }
}
