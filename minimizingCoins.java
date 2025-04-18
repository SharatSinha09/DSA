import java.util.*;
public class minimizingCoins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ds = sc.nextInt();
        int[] coins = new int[n];
        for(int i=0; i<n; i++){
            coins[i] = sc.nextInt();
        }
        sc.close();
        int[] dp = new int[ds+1];
        Arrays.fill(dp, -1);
        int ans = helper(ds, coins, dp);
        System.out.println(ans==Integer.MAX_VALUE ? -1 : ans);
    }

    //Memoization
    // public static int helper(int ds, int[] coins, int[] dp){
    //     if(ds==0) return 0;
    //     if(ds<0) return Integer.MAX_VALUE;
    //     if(dp[ds] != -1) return dp[ds];
    //     int res = Integer.MAX_VALUE;
    //     for(int coin : coins){
    //         if(coin <= ds){
    //             int sub = helper(ds-coin, coins, dp);
    //             if(sub!=Integer.MAX_VALUE){
    //                 res = Math.min(res, 1+ sub);
    //             }
    //         }
    //     }
    //     return dp[ds] = res;
    // }

    //Tabulation
    public static int helper(int ds, int[] coins, int[] dp){
        dp[0] = 0;

        for(int i=1; i<=ds; i++){
            int res = Integer.MAX_VALUE;
            for(int j=0; j<coins.length; j++){
                if(coins[j] <= i){
                    int sub = dp[i-coins[j]];
                    if (sub != Integer.MAX_VALUE) {
                        res = Math.min(res, 1+sub);
                    }
                }
            }
            dp[i] = res;
        }
        return dp[ds];
    }
}