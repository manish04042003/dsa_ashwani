package Strings;

public class permutations {
    public static void main(String[] args) {
        String s = "abc";
        int totalPermuations =1;
        for (int i =2 ; i <= s.length(); i++ ){
            totalPermuations*=i;
        }

        System.out.println(s);
        for (int i =1 ; i < totalPermuations ; i++){
            StringBuilder sb = new StringBuilder(s);
            int pNumber = i;
            for (int j =3 ; j>0 ; j--){
                int r = pNumber%j;
                pNumber = pNumber/j;
                System.out.print(sb.charAt(r));
                sb.deleteCharAt(r);
            }
            System.out.println("");
        }
    }
}
