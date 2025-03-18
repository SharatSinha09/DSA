// Leetcode 1431
import java.util.ArrayList;
import java.util.List;

public class kidsWithCandies {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        List<Boolean> res = kidsCandies(candies, extraCandies);
        for(boolean i : res){
            System.out.print(i + " ");
        }
    }
    public static List<Boolean> kidsCandies(int[] candies, int extraCandies) {
        List<Boolean> ls = new ArrayList<>();
        int maxCandy = 0;
        for(int candy : candies){
            if(candy > maxCandy){
                maxCandy = candy;
            }
        }
        for(int candy : candies){
            ls.add(candy+extraCandies >= maxCandy);
        }
        return ls;
    }
}
