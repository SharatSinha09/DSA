public class convertArrToMat {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int m = 2;
        int n = 2;
        int[][] ans = constructMat(arr, m, n);
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(ans[i][j] +  " ");
            }
            System.out.println();
        }
    }
    public static int[][] constructMat(int[] arr, int m, int n){
        int idx = 0;
        int[][] res = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                res[i][j] = arr[idx++];
            }
        }
        return res;
    }
}
