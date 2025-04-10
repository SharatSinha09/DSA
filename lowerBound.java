import java.util.*;
public class lowerBound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        sc.close();
        System.out.println(lowerB(nums, x));
    }
    public static int lowerB(int[] nums, int x) {
       int l = 0;
       int h = nums.length-1;
       int res = nums.length;
       while(l <= h){
        int m = l+(h-l)/2;
        if(nums[m] >= x){
            res = m;
            h = m-1;
        }
        else{
            l = m+1;
        }
       }
       return res;
     }
}
