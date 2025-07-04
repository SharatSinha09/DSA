import java.io.*;
import java.util.*;

public class buildingRoads {
    static int[] parent, rank;

    static int find(int x) {
        if (parent[x] != x)
            parent[x] = find(parent[x]);
        return parent[x];
    }

    static boolean union(int x, int y) {
        int px = find(x);
        int py = find(y);
        if (px == py)
            return false;
        if (rank[px] < rank[py]) {
            parent[px] = py;
        } else {
            parent[py] = px;
            if (rank[px] == rank[py])
                rank[px]++;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        parent = new int[n + 1];
        rank = new int[n + 1];
        for (int i = 1; i <= n; i++)
            parent[i] = i;

        List<int[]> existingEdges = new ArrayList<>();
        for (int i = 0; i < n - 1; i++) {
            String[] parts = br.readLine().split(" ");
            int u = Integer.parseInt(parts[0]);
            int v = Integer.parseInt(parts[1]);
            existingEdges.add(new int[] { u, v });
        }

        List<int[]> removedEdges = new ArrayList<>();
        for (int[] e : existingEdges) {
            if (!union(e[0], e[1])) {
                removedEdges.add(e);
            }
        }

        List<int[]> newEdges = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {
                if (find(i) != find(j)) {
                    union(i, j);
                    newEdges.add(new int[] { i, j });
                }
            }
        }

        System.out.println(newEdges.size());
        for (int i = 0; i < newEdges.size(); i++) {
            int[] rem = removedEdges.get(i);
            int[] add = newEdges.get(i);
            System.out.println(rem[0] + " " + rem[1] + " " + add[0] + " " + add[1]);
        }
    }
}
