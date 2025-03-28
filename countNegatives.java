public class countNegatives {
    public static void main(String[] args) {
        int[][] grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        System.out.println(countN(grid));
    }
    public static int countN(int[][] grid){
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;
        int i = m-1;
        int j = 0;
        while(i>=0 && j < n){
            if(grid[i][j] >= 0){
                j++;
            }else{
                count+=n-j;
                i--;
            }
        }
        return count;
    }
}
