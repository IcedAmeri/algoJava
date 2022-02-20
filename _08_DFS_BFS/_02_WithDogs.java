package _08_DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 석현
// Time: 328ms Memory: 32MB Lang: Java
public class _02_WithDogs {

    static int limit = 0;
    static int max = 0;

    public static void main(String[] args) throws IOException {
        _02_WithDogs main = new _02_WithDogs();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] array = Arrays.stream(br.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        limit = array[0];
        int[] dogs = new int[array[1]];

        for (int i = 0; i < array[1]; ++i) {
            dogs[i] = Integer.parseInt(br.readLine());
        }

        main.dfs(0, 0, dogs);
        System.out.print(max);
    }

    private void dfs(int idx, int sum, int[] dogs) {

        if (sum > limit) {
            return;
        }

        if (max < sum) {
            max = sum;
        }
        if (idx != dogs.length && sum != limit) {
            dfs(idx + 1, sum, dogs);
            dfs(idx + 1, sum + dogs[idx], dogs);
        }
    }
}
