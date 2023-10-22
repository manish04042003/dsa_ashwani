package Strings;

import java.util.HashMap;

public class anagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        if (s.length()!=t.length()){
            System.out.println("false");
            return;
        }
        HashMap<Character, Integer> hash = new HashMap<>();
        for(int i = 0 ;i < s.length();i++){
            if (hash.containsKey(s.charAt(i))){
                hash.put(s.charAt(i),hash.get(s.charAt(i))+1);
            }else {
                hash.put(s.charAt(i),1);
            }
        }

        for(int i = 0 ;i < t.length();i++){
            if (hash.containsKey(t.charAt(i))){
                if (hash.get(t.charAt(i))<=1){
                    hash.remove(t.charAt(i));
                }else {
                    hash.put(t.charAt(i),hash.get(t.charAt(i))-1);
                }
            }else {
                System.out.println("false");
                return;
            }
        }
        if (hash.isEmpty()){
            System.out.println("true");
        }else{
            System.out.println("false");
        }





        
    }
}
