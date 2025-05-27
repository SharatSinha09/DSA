import java.util.*;

public class countingDivisors {

    static final int MAX = 1000001;
    static int[] divisors = new int[MAX];

    public static void precomputeDivisors() {
        for (int i = 1; i < MAX; i++) {
            for (int j = i; j < MAX; j += i) {
                divisors[j]++;
            }
        }
    }

    public static int[] countDivs(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = divisors[arr[i]];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int maxVal = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            maxVal = Math.max(maxVal, arr[i]);
        }
        sc.close();

        precomputeDivisors();

        int[] result = countDivs(arr);
        for (int res : result) {
            System.out.println(res);
        }
    }
}
