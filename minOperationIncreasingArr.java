//Leetcode 1827
public class minOperationIncreasingArr {
    public static void main(String[] args) {
        int[] nums = {1,1,1};
        System.out.println(minOperations(nums));
    }
    public static int minOperations(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int idx = 0;
        for(int num  : nums){
            res[idx++] = num;
        }
        for(int i=0; i<n-1; i++){
            if(res[i+1] <= res[i]){
                res[i+1] = res[i]+1;
            }
        }
        int count = 0;
        for(int i=0; i<n; i++){
            count+=res[i] - nums[i];
        }
        return count;
    }
}
