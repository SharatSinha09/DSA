// import java.util.*;
public class tribonacci {
    public static void main(String[] args) {
        int n =37;
        // int[] dp = new int[n+1];
        // Arrays.fill(dp, -1);
        // System.out.println(helper(n, dp));
        System.out.println(helper(n));
    }

    //Memoization
    // public static int helper(int n, int[] dp){
    //     if(n==0 || n==1) return n;
    //     if(n==2) return 1;
    //     if(dp[n] != -1) return dp[n];
    //     return dp[n] = (helper(n-1, dp)+helper(n-2, dp)+helper(n-3, dp));
    // }

    //Tabulation
    // public static int helper(int n, int[] dp){
    //     dp[0] = 0;
    //     dp[1] = 1;
    //     dp[2] = 1;
    //     for(int i=3; i<=n; i++){
    //         dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
    //     }
    //     return dp[n];
    // }

    //Space optimization
    public static int helper(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;
        if(n == 2) return 1;
        int a = 0, b = 1, c = 1;
        for(int i=3; i<=n; i++){
            int d = a+b+c;
            a = b;
            b = c;
            c = d;
        }
        return c;
    }

}
