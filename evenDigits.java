//Leetcode 1295
public class evenDigits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }
    public static int findNumbers(int[] nums) {
        int even = 0;
        for(int i=0; i<nums.length; i++){
            if(countDigit(nums[i])%2 == 0){
                even++;
            }
        }
        return even;
    }
    public static int countDigit(int n) {
        int count = 0;
        while(n > 0){
            count++;
            n/=10;
        }
        return count;
    }
}
