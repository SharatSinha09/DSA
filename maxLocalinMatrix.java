//Leetcode 2373
public class maxLocalinMatrix {
    public static void main(String[] args) {
        int[][] grid = {{9,9,8,1},{5,6,2,6},{8,2,6,4},{6,2,2,2}};
        int[][] res = largestLocal(grid);
        for(int i=0; i<res.length; i++){
            for(int j=0; j<res.length; j++){
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int[][] maxLocal = new int[n-2][n-2];
        for(int i=0; i<n-2; i++){
            for(int j=0; j<n-2; j++){
                int max = 0;
                for(int k=i; k<i+3; k++){
                    for(int l=j; l<j+3; l++){
                        max = Math.max(max, grid[k][l]);
                    }
                }
                maxLocal[i][j] = max;
            }
        }
        return maxLocal;
    }
}
