//Leetcode 76

import java.util.*;
class minWindowSubStr{
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(minWindow(s, t));
    }
    public static String minWindow(String s, String t){
        int i=0;
        int j=0;
        int minI=0;
        int minWS = Integer.MAX_VALUE;
        int tcc=t.length();
        int n = s.length();
        HashMap<Character, Integer> mp = new HashMap<>();
        for(char c : t.toCharArray()){
            mp.put(c, mp.getOrDefault(c, 0) + 1);
        }
        while(j < n){
            char lastChar = s.charAt(j);
            if(mp.containsKey(lastChar)){
                if(mp.get(lastChar) > 0){
                    tcc--;
                }
                mp.put(lastChar, mp.get(lastChar)-1);
            }
            while(tcc == 0){
                int ws = j-i+1;
                if(ws < minWS){
                    minWS = ws;
                    minI = i;
                }
                char firstChar = s.charAt(i);
                if(mp.containsKey(firstChar)){
                    mp.put(firstChar, mp.get(firstChar) + 1);
                    if(mp.get(firstChar) > 0){
                        tcc++;
                    }
                }
                i++;
            }
            j++;
        }

        return minWS == Integer.MAX_VALUE ? "" : s.substring(minI, minI+minWS);
    }
}