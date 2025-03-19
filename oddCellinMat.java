public class oddCellinMat {
    public static void main(String[] args) {
        int m = 2;
        int n = 3;
        int[][] indices = {{0,1},{1,1}};
        System.out.println(oddCells(m,n,indices));
    }
    public static int oddCells(int m, int n, int[][] indices) {
        int[][] res = new int[m][n];
        for(int ind=0; ind<indices.length; ind++){
            int r = indices[ind][0];
            int c = indices[ind][1];
            for(int i=0; i<n; i++){
                res[r][i]++;
            }
            for(int j=0; j<m; j++){
                res[j][c]++;
            }
        }

        int count = 0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(res[i][j]%2 != 0){
                    count++;
                }
            }
        }
        return count;
    }
}
