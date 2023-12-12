package GFG;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class gcdOfStrings {
    public static void main(String[] args) {
        int[] candies = {23,33,32,232,32,3,23,2,2,3};
        int extraCandies = 200;
        List<Boolean> ans = kidsWithCandies(candies,extraCandies);
        System.out.println(ans);

    }

    private static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();
        int max = candies[0];
        for (int i =1 ; i< candies.length; i ++){
            if(max< candies[i] ){
                max = candies[i];
            }
        }

        for (int i =0 ; i< candies.length; i ++){
            ans.add(candies[i] + extraCandies >= max);
        }

        return ans ;
    }
}
