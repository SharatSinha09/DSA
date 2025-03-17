//Leetcode 566
public class reshapeMat {
    public static void main(String[] args) {
        int[][] mat = {{1,2},{3,4}};
        int r = 1;
        int c = 4;
        int[][] res = matrixReshape(mat, r, c);
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] res = new int[r][c];
        if(m*n != r*c) return mat;
        int row = 0;
        int col = 0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                res[row][col++] = mat[i][j];
                if(col == c){
                    col = 0;
                    row++;
                }
            }
        }
        return res;
    }
}
