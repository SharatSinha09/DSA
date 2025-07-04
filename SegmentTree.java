import java.util.*;
class tNode{
    int data;
    tNode left;
    tNode right;
    public tNode(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
public class SegmentTree {
    public static void buildSegmentTree(int s, int e, int idx, int[] St, int[] arr){
        if(s == e){
            St[idx] = arr[s];
            return;
        }
        int m = s+(e-s)/2;
        buildSegmentTree(s, m, 2*s+1, St, arr);
        buildSegmentTree(m+1, e, 2*s+2, St, arr);
        St[idx] = Math.max(St[2*s+1], St[2*s+2]);
    }
    public static int getMax(int l, int r, int idx, int low, int high, int[] St, int[] arr){
        if(l <= low && high <= r){
            return St[idx];
        }
        else if(high < l || low > r){
            return Integer.MIN_VALUE;
        }
        int mid = l+(r-l)/2;
        int left = getMax(2*l+1, low, idx, l, r, St, arr);
        int right = getMax(2*l+2, mid+1, idx, l, r, St, arr);
        return Math.max(left, right);
    }
    public static void update(int idx, int low, int high, int i, int newV, int[] arr, int[] St){
        if(i == idx){
            arr[i] = newV;
            St[idx] = newV;
        }
        int mid = low+(high-low)/2;
        if(i >= low && i <= mid) {
            update(2*idx+1, low, mid, i, newV, arr, St);
        }
        update(2*idx+2, mid+1, high, i, newV, arr, St);
        St[idx] = Math.max(St[2*idx+1], St[2*idx+2]);
    }
    public static void main(String[] args) {
        int[] arr = new int[1000];
        int[] St = new int[4000];
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int l = sc.nextInt();
        int r = sc.nextInt();
        buildSegmentTree(0, n-1, 0, St, arr);
        System.out.println(getMax(l, r, 0, 0, n-1, St, arr));
        int newV = sc.nextInt();
        update(0, 0, n-1, 0, newV, arr, St);
        sc.close();
    }
}
