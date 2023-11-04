package Strings;

public class AsciiDiff {
    public static void main(String[] args) {
        StringBuilder sd = new StringBuilder("absdhssfhs");
        for (int i=1 ; i< sd.length(); i+=2){
            int number = sd.charAt(i) - sd.charAt(i-1);
            System.out.println((char) number);
//            sd.setCharAt(i,(char)number);
        }

        System.out.println(sd);
    }
}
