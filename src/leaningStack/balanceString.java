package leaningStack;

import java.util.Stack;

public class balanceString {
    public static void main(String[] args) {
        String s = "({}([)])[]";

        System.out.println(check(s));;
    }

    public static  boolean check(String s){
        Stack<Character> stack = new Stack<>();
        for(int i =0 ; i< s.length();i++){
           if(s.charAt(i)=='('){
               stack.add(')');
           }else if (s.charAt(i)=='{') {
               stack.add('}');
           }else if (s.charAt(i)=='[') {
               stack.add(']');
           }else {
               if (stack.empty()){
                   return false;
               }else {
                   char cc = stack.pop();
                   if(s.charAt(i)!=cc){
                        return false;
                   }
               }

           }
        }
        if(stack.isEmpty()){
            return true;
        }else {
            return false;

        }
    }
}

