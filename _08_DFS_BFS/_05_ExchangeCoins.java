package _08_DFS_BFS;

import java.util.*;

public class _05_ExchangeCoins {
    static int res = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr, Collections.reverseOrder());

        int m = sc.nextInt();

        dfs(0, 0, m, arr);
        System.out.println(res);
    }

    private static void dfs(int cnt, int sum, int m, Integer[] arr) {
        if (sum > m || cnt > res) {
            return;
        }

        if (sum == m) {
            res = Math.min(cnt, res);
        } else {
            for (int i = 0; i < arr.length; ++i) {
                dfs(cnt + 1, sum + arr[i], m, arr);
            }
        }
    }
}
