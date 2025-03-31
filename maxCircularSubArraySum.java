public class maxCircularSubArraySum {
    public static void main(String[] args) {
        int[] arr = {8,-8,9,-9,10,-11,12};
        System.out.println(maxSubSum(arr));
    }
    public static int maxSubSum(int[] arr){
        int n = arr.length;
        int total = 0;
        int minSum = 0;
        int maxSum = 0;
        int curMax = 0;
        int curMin = 0;
        for(int i=0; i<n; i++){
            total+=arr[i];
            curMax = Math.max(curMax+arr[i], arr[i]);
            maxSum = Math.max(curMax, maxSum);
            curMin = Math.min(curMin+arr[i], arr[i]);
            minSum = Math.min(curMin, minSum);
        }
        if(minSum == total) return maxSum;
        return Math.max(maxSum, total-minSum);
    }
}
