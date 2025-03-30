public class minValPositiveSum {
    public static void main(String[] args) {
        int[] nums = {1,-2,-3};
        int n = nums.length;
        int min = 0;
        int[] pre = new int[n];
        pre[0] = nums[0];
        for(int i=1; i<n; i++){
            pre[i] = pre[i-1] + nums[i];
        }
        for(int p : pre){
            if(p < min) min = p;
        }
        System.out.println((min*-1) + 1);
    }
}
