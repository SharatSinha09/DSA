import java.util.ArrayList;
import java.util.List;

public class createtargetArray {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        int[] target = createTargetArray(nums, index);
        for(int t : target){
            System.out.print(t +  " " );
        }
    }
    public static int[] createTargetArray(int[] nums, int[] index) {
        int n = nums.length;
        List<Integer> ls = new ArrayList<>();
        for(int i=0; i<n; i++){
            ls.add(index[i], nums[i]);
        }
        int[] target = new int[n];
        for(int i=0; i<n; i++){
            target[i] = ls.get(i);
        }
        return target;
    }
}
