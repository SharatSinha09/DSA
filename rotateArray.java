import java.util.*;

public class rotateArray {
    public static void reverse(int[] nums, int s, int e) {
        while (s < e) {
            int temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp;
            s++;
            e--;
        }
    }

    public static void rotateArr(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        reverse(nums, n - k, n - 1);
        reverse(nums, 0, n - k - 1);
        reverse(nums, 0, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        System.out.println("Enter k :");
        int k = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter " + n + " nums : ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        sc.close();
        rotateArr(nums, k);
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
