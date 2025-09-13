import java.util.*;

public class sortedArrSq {
    public static int[] squareArr(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            nums[i] *= nums[i];
        }
        Arrays.sort(nums);
        return nums;
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
        int[] ans = squareArr(nums);
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
