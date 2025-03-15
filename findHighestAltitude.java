//Leetcode 1732
public class findHighestAltitude {
    public static void main(String[] args) {
        int[] gain = {-4,-3,-2,-1,4,3,2};
        System.out.println(largestAltitude(gain));
    }
    public static int largestAltitude(int[] gain) {
        int alt = 0;
        int max = 0;
        for(int g : gain){
            alt+=g;
            if(alt > max){
                max = alt;
            }
        }
        return max;
    }
}
