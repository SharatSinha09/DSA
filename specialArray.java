public class specialArray {

    public static void main(String[] args) {
        int[] nums = {3,5};
        System.out.println(xgreaterx(nums));
    }
    public static int xgreaterx(int[] nums){
        int l=0;
        int h=nums.length;
        while(l<=h){
            int m = l+(h-l)/2;
            int cnt = 0;
            for(int num : nums){
                if(num >= m) cnt++;
            }
            if(cnt == m) return m;
            if(cnt > m) l=m+1;
            else h=m-1;
        }
        return -1;
    }
}