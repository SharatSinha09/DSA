//Leetcode 1313
public class decompressArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] ans = decompressRLElist(nums);
        for(int i : ans){
            System.out.print(i + " ");
        }
    }
    public static int[] decompressRLElist(int[] nums) {
        int n = nums.length;
        int len = 0;
        for(int i=0; i<n; i+=2){
            len+=nums[i];
        }
        int[] res = new int[len];
        int idx = 0;
        for(int i=0; i<n; i+=2){
            int freq = nums[i];
            int val = nums[i+1];
            for(int j=0; j<freq; j++)
            res[idx++] = val;
        }
        return res;
    }
}
