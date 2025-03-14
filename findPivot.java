// Leetcode 724
public class findPivot {
    public static int pivot(int[] nums, int n){
        int sum = 0;
        for(int num : nums){
            sum+=num;
        }
        int lSum = 0;
        for(int i=0; i<n; i++){
            // right sum = total sum - left sum - current num in array
            int rSum = sum - lSum - nums[i];
            if(lSum == rSum){
                return i;
            }
            lSum+=nums[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int n = nums.length;
        System.out.println(pivot(nums, n));
    }
}
