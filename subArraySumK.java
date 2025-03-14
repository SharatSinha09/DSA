// Leetcode 560
public class subArraySumK {
    public static void main(String[] args) {
        int[] nums = {1,1,1};
        int k = 2;
        System.out.println(subarraySum(nums, k));
    }
    public static int subarraySum(int[] nums, int k) {
        int count = 0;
        int n = nums.length;
        int[] pre = new int[n+1];
        pre[0] = 0;
        for(int i=1; i<pre.length; i++){
            pre[i] = pre[i-1] + nums[i-1];
        }
        for(int i=0; i<pre.length-1; i++){
            for(int j=i+1; j<pre.length; j++){
                if(pre[j] - pre[i] == k){
                    count++;
                }
            }
        }
        return count;
    }
}
