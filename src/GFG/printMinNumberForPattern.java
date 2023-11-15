package GFG;

public class printMinNumberForPattern {
    public static void main(String[] args) {
        String s = "D";
        StringBuilder str = new StringBuilder(s);
        StringBuilder ans = new StringBuilder("");

        int max = str.length() +1;
        int min = 1;

        if (str.charAt(0)=='I'){
            ans.append(min);
            min++;
        }else{
            ans.append(max);
            max--;
        }

        for (int i = 0 ; i < str.length(); i++){
            if (str.charAt(i)=='I'){
                ans.append(min);
                min++;
            }else {
                ans.append(max);
                max--;
            }
        }

        String a = ans.toString();
        System.out.println(ans);
    }
}
