//Leetcode 1662
public class strEquivalent {
    public static void main(String[] args) {
        String[] word1 = {"a", "bc"};
        String[] word2 = {"ab", "c"};
        boolean ans = arrayStringsAreEqual(word1, word2);
        System.out.println(ans);
    }
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder w1 = new StringBuilder();
        StringBuilder w2 = new StringBuilder();
        for(int i=0; i<word1.length; i++){
            w1.append(word1[i]);
        }
        for(int i=0; i<word2.length; i++){
            w2.append(word2[i]);
        }
        return (w1.toString()).equals((w2.toString()));
    }
}
