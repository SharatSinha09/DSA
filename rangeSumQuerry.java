// Leetcode 303.
public class rangeSumQuerry {

    public static void main(String[] args) {
        int[] nums = {-2,0,3,-5,2,-1};
        int n = nums.length;

        // range from left to right
        int left = 2;
        int right = 5;

        int[] pre = new int[n];
        pre[0] = nums[0];
        for(int i=1; i<n; i++){
            pre[i] = pre[i-1] + nums[i];
        }
        if(left == 0){
            System.out.println(pre[right]);
        }else{
            System.out.println(pre[right] - pre[left-1]);
        }
    }
}