package Strings;

import java.util.Collection;
import java.util.HashMap;

public class Sortfrequency {
    public static void main(String[] args) {
        String s= "aatreea";
        HashMap<Character,Integer> hash = new HashMap<>();
        for (int i =0 ; i < s.length() ; i++){
            if (hash.containsKey(s.charAt(i))){
                hash.put(s.charAt(i), hash.get(s.charAt(i))+1);
            }else {
                hash.put(s.charAt(i),1);
            }
        }

            

        System.out.println(hash);


    }
}
