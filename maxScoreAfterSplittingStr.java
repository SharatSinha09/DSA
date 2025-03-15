//Leetcode 1422
public class maxScoreAfterSplittingStr {
    public static void main(String[] args) {
        String s = "011101";
        System.out.println(maxScore(s));
    }
    public static int maxScore(String s) {
        int total1 = 0;
        int one = 0;
        int zero = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '1'){
                total1++;
            }
        }
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '1'){
                one++;
            }else{
                zero++;
            }
            int score = total1-one+zero;
            max = Math.max(max,score);
        }
        return max;
    }
}
