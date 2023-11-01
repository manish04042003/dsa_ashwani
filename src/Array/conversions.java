package Array;

import java.lang.reflect.Type;
import java.util.Scanner;

public class conversions {

    public static  int decimaltoany(int Number, int type){
        int ans =0;
        int index = 0;
        while(Number>0){
            ans = ans + ((Number%type)*(int) (Math.pow(10,index)));
            Number = Number/ type;
            index ++;
        }
        return ans;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Type your Decimal Number");
        int number = sc.nextInt();
        System.out.println("Write Your Type to iin Which you want to convert");
        int type = sc.nextInt();

        System.out.println(decimaltoany(number,type));

    }
}
