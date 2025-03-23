
//Leetcode 48
class rotateImg{
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(mat);
    }
    public static void rotate(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int top = 0;
        int bottom = m-1;
        while(top < bottom){
            for(int i=0; i<n; i++){
                int temp = matrix[top][i];
                matrix[top][i] = matrix[bottom][i];
                matrix[bottom][i] = temp;
            }
            top++;
            bottom--;
        }
        for(int r=0; r<m; r++){
            for(int c=r+1; c<m; c++){
                int temp = matrix[r][c];
                matrix[r][c] = matrix[c][r];
                matrix[c][r] = temp;
            }
        }
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }
}