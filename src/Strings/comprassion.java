package Strings;

public class comprassion {
    public static void main(String[] args) {
        String s = "aaabbbbbbbcdddsss";
        System.out.println(comprassion1(s));
        System.out.println(comprassion2(s));

    }

    private static StringBuilder comprassion1(String s) {
        StringBuilder comprassion1 = new StringBuilder();
        comprassion1.append(s.charAt(0));
        for (int i =1 ; i < s.length(); i++){
            if (s.charAt(i)!=s.charAt(i-1)){
                comprassion1.append(s.charAt(i));
            }
        }
        return comprassion1;
    }
    private static StringBuilder comprassion2(String s) {
        StringBuilder comprassion1 = new StringBuilder();
        comprassion1.append(s.charAt(0));
        int count = 1;
        for (int i =1 ; i < s.length(); i++){
//            String s = "aaabbbcdddsss";
            if (s.charAt(i)!=s.charAt(i-1)){
                if (count>1){
                    comprassion1.append(count);
                    count = 1;
                }
                comprassion1.append(s.charAt(i));
            }else{
                count ++;
            }
        }
        if (count>1){
            comprassion1.append(count);
        }

        return comprassion1;
    }
}
