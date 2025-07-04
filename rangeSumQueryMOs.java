import java.util.*;
public class rangeSumQueryMOs {
    public static int Query(long[] arr, long[] proArr, int sqrt, int l, int r){
        int res = 0;
        while(l%sqrt != 0 && l<r && l!=0){
            res+=arr[l++];
        }
        while(l+sqrt <= r){
            res+=proArr[l/sqrt];
            l+=sqrt;
        }
        while(l<=r){
            res+=arr[l++];
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        long[] arr = new long[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int sqrt = (int)Math.sqrt(n);
        long proArr[] = new long[sqrt+1];
        int idx = -1;
        for(int i=0; i<n; i++){
            if(i%sqrt == 0) idx++;
            proArr[idx] += arr[i];
        }
        while(x != 0){
            int l = sc.nextInt();
            int r = sc.nextInt();
            System.out.println(Query(arr, proArr, sqrt, l, r));
            x--;
        }
        sc.close();
    }
}
