package _08_DFS_BFS;

import java.util.Arrays;
import java.util.Scanner;

public class _07_Memoization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int r = sc.nextInt();

        int[][] arr = new int[n+1][r+1];
        for (int[] ints : arr) {
            Arrays.fill(ints, 0);
        }

        int res = dy(n, r, arr);
        System.out.println(res);
    }

    static int dy(int n, int r, int[][] arr) {
        if (arr[n][r] != 0) {
            return arr[n][r];
        }

        if (n == r || r == 0) {
            arr[n][r] = 1;
            return 1;
        }

        arr[n][r] = dy(n - 1, r - 1, arr) + dy(n - 1, r, arr);
        return arr[n][r];
    }
}
