public class kthMissingNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int k = 2;
        System.out.println(kthmissNum(arr, k));
    }
    public static int kthmissNum(int[] arr, int k){
        int l = 0;
        int h = arr.length-1;
        while(l <= h){
            int m = l+(h-l)/2;
            int misCnt = arr[m]-m-1;
            if(misCnt < k) l = m+1;
            else{
                h=m-1;
            }
        }
        return l+k;
    }
}