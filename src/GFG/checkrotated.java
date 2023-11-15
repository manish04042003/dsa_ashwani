package GFG;

public class checkrotated {
    public static void main(String[] args) {
        String str1 = "amazon";
        String str2 ="azonam";

        StringBuilder sub1start = new StringBuilder(str1.substring(0, 2));
        StringBuilder sub1end = new StringBuilder(str1.substring(str1.length() - 2));
        StringBuilder sub2start = new StringBuilder(str2.substring(0, 2));
        StringBuilder sub2end = new StringBuilder(str2.substring(str1.length() - 2));
//        sub2start.toString().equals(sub1end.toString())
        if (sub1start.toString().equals(sub2end.toString()) || sub2start.toString().equals(sub1end.toString())){
            StringBuilder sub1 = new StringBuilder(str1.substring(2));
            StringBuilder sub2 = new StringBuilder(str1.substring(0, str1.length() - 2));
            System.out.println(str2.contains(sub1) || str2.contains(sub2));
//            return (str2.contains(sub1) || str2.contains(sub2));
        }else{
//            return false;
            System.out.println(false);
        }

    }
}
