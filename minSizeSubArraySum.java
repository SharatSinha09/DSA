import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class minSizeSubArraySum {
    public static int minWindow(int n, int[] nums, int target) {
        int i = 0;
        int j = 0;
        int minLen = Integer.MAX_VALUE;
        int sum = 0;
        while (j < n) {
            sum += nums[j];
            while (sum >= target) {
                minLen = Math.min(minLen, j - i + 1);
                sum -= nums[i++];
            }
            j++;
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter size of array : ");
        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[n];
        System.out.println("Enter " + n + " number :");
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(br.readLine());
        }
        System.out.println("Enter the target : ");
        int target = Integer.parseInt(br.readLine());

        System.out.println("Result : " + minWindow(n, nums, target));
    }
}
