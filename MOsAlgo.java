import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class MOsAlgo {

    static int[] arr;
    static int[] freq = new int[1000001];
    static int count = 0;

    static class Query {
        int l, r, index, block;

        public Query(int l, int r, int index, int blockSize) {
            this.l = l;
            this.r = r;
            this.index = index;
            this.block = l / blockSize;
        }
    }

    public static void add(int index) {
        int value = arr[index];
        freq[value]++;
        if (freq[value] == 1) {
            count++;
        }
    }

    public static void remove(int index) {
        int value = arr[index];
        freq[value]--;
        if (freq[value] == 0) {
            count--;
        }
    }

    public static void main(String[] args) throws IOException {
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);

        int n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int q = sc.nextInt();
        int blockSize = (int) Math.sqrt(n);
        ArrayList<Query> queries = new ArrayList<>();
        for (int i = 0; i < q; i++) {
            int l = sc.nextInt() - 1;
            int r = sc.nextInt() - 1;
            queries.add(new Query(l, r, i, blockSize));
        }

        Collections.sort(queries, (a, b) -> {
            if (a.block != b.block) {
                return Integer.compare(a.block, b.block);
            }
            if ((a.block & 1) != 0) {
                return Integer.compare(b.r, a.r);
            }
            return Integer.compare(a.r, b.r);
        });

        int[] answers = new int[q];
        int currentL = 0;
        int currentR = -1;

        for (Query query : queries) {
            int l = query.l;
            int r = query.r;

            while (currentL > l) {
                currentL--;
                add(currentL);
            }
            while (currentR < r) {
                currentR++;
                add(currentR);
            }
            while (currentL < l) {
                remove(currentL);
                currentL++;
            }
            while (currentR > r) {
                remove(currentR);
                currentR--;
            }
            answers[query.index] = count;
        }
        for (int i = 0; i < q; i++) {
            out.println(answers[i]);
        }
        out.flush();
        out.close();
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}