// Leetcode 1480.
class runningSum{
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int n = nums.length;
        int[] preSum = new int[n];
        preSum[0] = nums[0];
        for(int i=1; i<n; i++){
            preSum[i] = preSum[i-1] + nums[i];
        }
        for(int pre : preSum){
            System.out.print(pre + " ");
        }
        System.out.println();
    }
}