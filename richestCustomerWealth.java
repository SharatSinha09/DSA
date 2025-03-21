public class richestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},{3,2,1}};
        System.out.println(maximumWealth(accounts));
    }
    public static int maximumWealth(int[][] accounts) {
        int customer = accounts.length;
        int bank = accounts[0].length;

        int max = 0;
        for(int i=0; i<customer; i++){
            int sum = 0;
            for(int j=0; j<bank; j++){
                sum+=accounts[i][j];
            }
            if(sum > max){
                max = sum;
            }
        }
        return max;
    }
}
