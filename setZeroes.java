public class setZeroes {
    public static void main(String[] args) {
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        setMatZeroes(matrix , m, n);
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void setMatZeroes(int[][] matrix, int m, int n){
        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(matrix[i][j] == 0){
                    row[i] = true;
                    col[j] = true;
                }
            }
        }
        for(int i=0; i<m; i++){
            if(row[i]){
                for(int j=0; j<n; j++){
                    matrix[i][j] = 0;
                }
            }
        }
        for(int i=0; i<n; i++){
            if(col[i]){
                for(int j=0; j<m; j++){
                    matrix[j][i] = 0;
                }
            }
        }
    }
    
}
