import java.util.*;
public class stringMatching {
    public static void main(String[] args) {
        String letter = "eidbac";
        String code = "ab";
        System.out.println(Matched(code, letter));
    }

    public static boolean Matched(String s1, String s2) {
        int n = s2.length();
        int m = s1.length();
        int tcc = m;
        int i = 0;
        int j = 0;
        HashMap<Character, Integer> mp = new HashMap<>();
        for (char ch : s1.toCharArray()) {
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
        }
        while (j < n) {
            char lastChar = s2.charAt(j);
            if (mp.containsKey(lastChar)) {
                mp.put(lastChar, mp.get(lastChar) - 1);
                if (mp.get(lastChar) >= 0)
                    tcc--;
            }
            if (j - i + 1 == m) {
                if (tcc == 0)
                    return true;

                char startChar = s2.charAt(i);
                if (mp.containsKey(startChar)) {
                    mp.put(startChar, mp.get(startChar) + 1);
                    if (mp.get(startChar) > 0)
                        tcc++;
                }
                i++;
            }
            j++;
        }
        return false;
    }
}
