public class countNegatives {
    public static void main(String[] args) {
        int[][] grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        System.out.println(countN(grid));
    }
    
    public static int countN(int[][] grid) {
        int cnt = 0;
        for(int i=0; i<grid.length; i++){
            int l=0;
            int h=grid[0].length-1;
            while(l<=h){
                int m = l+(h-l)/2;
                if(grid[i][m] >= 0){
                    l=m+1;
                }
                else{
                    h=m-1;
                }
            }
            cnt += grid[0].length-l;
        }
        return cnt;
    }
}
