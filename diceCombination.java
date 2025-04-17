import java.util.*;
public class diceCombination {
    static long m = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        long[] dp = new long[n+1];
        Arrays.fill(dp, -1);
        System.out.println(helper(n, dp));
    }
    //Memoization
    // public static long helper(int n, long[] dp){
    //     if(n == 0)return 1;
    //     if(n < 0 )return 0;
    //     if(dp[n] != -1) return (dp[n])%m;
    //     long sum = 0;
    //     for(int i=1; i<=6; i++){
    //         if(n-i >= 0){
    //             sum+=(helper(n-i, dp))%m;
    //         }
    //     }
    //     return dp[n] = sum%m;
    // }

    // Tabulation
    public static long helper(int n, long[] dp){
        dp[0] = 1;
        for(int i=1; i<=n; i++){
            long sum=0;
            for(int j=1; j<=6; j++){
                if(i-j >= 0){
                    sum+=(dp[i-j])%m;
                }
            }
            dp[i] = sum%m;
        }
        return dp[n]%m;
    }
}
