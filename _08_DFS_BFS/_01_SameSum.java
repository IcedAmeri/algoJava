package _08_DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 석현
public class _01_SameSum {
    private static int target = 0;

    public static void main(String[] args) throws IOException {
        _01_SameSum main = new _01_SameSum();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        int[] array = Arrays.stream(br.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int i = Arrays.stream(array).sum() % 2;
        if (i != 0) {
            System.out.println("NO");
        } else {
            target = Arrays.stream(array).sum() / 2;
            main.dfs(0, 0, array);
        }
    }

    boolean dfs(int idx, int sum, int[] array) {
        if (sum > target) {
            return false;
        }

        if (idx == array.length) {
            if (sum == target) {
                System.out.print("YES");
                return true;
            }
        } else {
            return dfs(idx + 1, sum + array[idx], array) ||
                    dfs(idx + 1, sum, array);
        }

        return false;
    }
}
