import java.util.*;

public class maxSubArrSum {
    public static int maxSubSum(int[] nums) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (sum < 0) {
                sum = 0;
            }
            sum += nums[i];
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter " + n + " nums : ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(maxSubSum(nums));
    }
}
