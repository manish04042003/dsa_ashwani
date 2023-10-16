package Strings;

import java.sql.Struct;

public class removeOuterParentheses {
    public static void main(String[] args) {
        String GivenString = "()";
        String str = "";
        int count =1 ;
        int indO = 0 ;
        for(int i =1 ; i <GivenString.length(); i ++){
            if(GivenString.charAt(i) == '('){
                count ++;
            }else{
                count --;
            }
            if (count==0){
//                str = str+GivenString.substring(indO+1,i);
                GivenString = GivenString.substring(indO+1,i) + GivenString.substring(i,GivenString.length());
                indO = i+1;
            }

        }
        System.out.print(GivenString);
    }
}
