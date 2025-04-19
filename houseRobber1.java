import java.util.*;
public class houseRobber1 {
    //Memoization
    // public static int helper(int[] nums, int n, int[] dp){
    //     if(n<0) return 0;
    //     if(dp[n]!=-1) return dp[n];
    //     return dp[n] = Math.max(nums[n] + helper(nums, n-2, dp), helper(nums, n-1, dp));
    // }

    //Tabulatoin
    public static int helper(int[] nums, int n, int[] dp){
        if(n == 0) return nums[0];
        if(n == 1) return Math.max(nums[0], nums[1]);
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for(int i=2; i<=n; i++){
            dp[i] = Math.max(dp[i-2]+nums[i], dp[i-1]);
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int[] nums = {2,7,9,3,1};
        int n = nums.length;
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        System.out.println(helper(nums, n-1, dp));
    }
}
