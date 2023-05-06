// 10 Kinds Of People on open.kattis.com
// 5/6/2023
import java.util.*;

public class TenKindsOfPeople {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int height = in.nextInt();
        int width = in.nextInt();

        int[][] map = new int[height][width];
        DisjointSet djs = new DisjointSet(height * width);

        for (int i = 0; i < height; i++) {
            String row = in.next();
            for (int j = 0; j < width; j++) {
                if (row.charAt(j) == '0')
                    map[i][j] = 0;
                else
                    map[i][j] = 1;
            }
        }

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                if (y+1 != height && map[y][x] == map[y+1][x]) {
                    djs.union_to(y * width + x, (y+1) * width + x);
                }
                if (x+1 != width && map[y][x] == map[y][x+1]) {
                    djs.union_to(y * width + x, y * width + (x+1));
                }
            }
        }

        int numTests = in.nextInt();
        for (int i = 0; i < numTests; i++) {
            int y1 = in.nextInt()-1;
            int x1 = in.nextInt()-1;
            int y2 = in.nextInt()-1;
            int x2 = in.nextInt()-1;

            if (djs.find(y1 * width + x1) == djs.find(y2 * width + x2)) {
                if (map[y1][x1] == 0)
                    System.out.println("binary");
                if (map[y1][x1] == 1)
                    System.out.println("decimal");
            } else {
                System.out.println("neither");
            }
        }
    }
}

class DisjointSet {
    private ArrayList<Integer> store;

    public DisjointSet(int size) {
        store = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            store.add(i);
        }
    }

    public void union_to(int a, int b) {
        store.set(find(b), find(a));
    }

    public int find(int query) {
        if (store.get(query) == query)
            return query;
        return find(store.get(query));
    }
}