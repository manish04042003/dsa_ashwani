package Strings;
import java.util.HashMap;
public class tryHash {

    public static boolean ans(String s1,String s2){

        if(s1.length()!=s2.length()){
            return false;
        }

        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Boolean>  map2 = new HashMap<>();

        for(int i = 0;i<s1.length();i++){
             char froms = s1.charAt(i);
             char fromt = s2.charAt(i);
            if(map1.containsKey(froms)){
                if (map1.get(froms) != fromt){
                    return false;
                }
            }else {
                if(map2.containsKey(fromt)){
                    return false;
                }else {
                    map1.put(froms,fromt);
                    map2.put(fromt,true);
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "xyyz";
        boolean a = ans(s1,s2);
        System.out.println(a);

    }
}
