//Leetcode 523
public class continuousSubarraySum {
    public static void main(String[] args) {
        int[] nums = {23,2,4,6,7};
        int k = 6;
        System.out.println(checkSubarraySum(nums, k));
    }
    public static boolean checkSubarraySum(int[] nums, int k) {
        int n = nums.length;
        int[] pre = new int[n+1];
        for(int i=1; i<pre.length; i++){
            pre[i] = pre[i-1] + nums[i-1];
        }
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(k != 0 && (pre[j+1]- pre[i]) % k == 0){
                    return true;
                }
                if(k == 0 && pre[j+1]- pre[i] == 0){
                    return true;
                }
            }
        }
        return false;
    }
}
