import java.util.*;
public class TwoLargeBags {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            HashMap<Integer, Integer> mp = new HashMap<>();
            boolean flag = false;
            for(int i=0; i<n; i++){
                int num = sc.nextInt();
                mp.put(num, mp.getOrDefault(num, 0)+1);
            }
            for(Map.Entry<Integer, Integer> entry : mp.entrySet()){
                int key = entry.getKey();
                int val = entry.getValue();
                if(val >= 2){
                    key+=val-2;
                }
                if(val < 2){
                    flag = true;
                    break;
                }
            }
        }
    }
}
