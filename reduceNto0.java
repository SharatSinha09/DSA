import java.util.*;
public class reduceNto0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        System.out.println(helper(n, dp));
    }
    public static int helper(int n, int[] dp){
        if(n == 0){
            return 1;
        }
        if(dp[n] != -1) return dp[n];
        return dp[n] = helper(n/2, dp) + helper(n/3, dp);
    }
}