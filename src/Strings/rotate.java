package Strings;

public class rotate {
    public static void main(String[] args) {
        String s ="abcde";
        String goal = "cdeab";
        int n= s.length();
        System.out.println(goal.getClass());

        for(int i =0 ; i < n;i++){
            System.out.println(s);
            if(s.equals(goal)){
                System.out.println("True");
                return;
            }
            s= s.substring(n-1,n) +s.substring(0,n-1);
        }

        System.out.println("false");
    }
}
