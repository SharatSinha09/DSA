//Leetcode 867
public class transposeMat {
    public static void main(String[] args) {
        int[][] mat = {{2,4,-1},{-10,5,11},{18,-7,6}};
        int[][] res =  transpose(mat);
        for(int i=0; i<res.length; i++){
            for(int j=0; j<res[0].length; j++){
                System.out.print(res[i][j] + "   ");
            }
            System.out.println();
        }
    }
    public static int[][] transpose(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] res = new int[m][n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                res[j][i] = mat[i][j];
            }
        }
        return res;
    }
}
