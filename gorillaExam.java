import java.util.*;
public class gorillaExam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            HashMap<Integer, Integer> mp = new HashMap<>();
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
                mp.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);
            }
            List<Map.Entry<Integer, Integer>> sortedMp = new ArrayList<>(mp.entrySet());
            sortedMp.sort(Comparator.comparingInt(Map.Entry::getValue));
            int unique = sortedMp.size();
            int removed = 0;
            for(Map.Entry<Integer, Integer> entry : sortedMp){
                int freq = entry.getValue();
                if(removed+freq <= k){
                    removed+=freq;
                    unique--;
                }else{
                    break;
                }
            }
            System.out.println(unique);
        }
        sc.close();
    }
}
