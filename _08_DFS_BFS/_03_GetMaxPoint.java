package _08_DFS_BFS;

import java.util.Scanner;

// 석현
// Time: 171ms Memory: 27MB Lang: Java 닉네임: 7d84390dfd394566b31b
public class _03_GetMaxPoint {

    static int N;
    static int M;
    static int currMax = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt();
        M = scanner.nextInt();

        Task [] arr = new Task[N];

        for (int i = 0; i < N; ++i) {
            int point = scanner.nextInt();
            int time = scanner.nextInt();
            arr[i] = new Task(time, point);
        }

        dfs(0, 0, 0, arr);
        System.out.print(currMax);
    }

    private static void dfs(int idx, int st, int sp, Task[] arr) {

        if (st > M) {
            return;
        }

        if (sp > currMax) {
            currMax = sp;
        }

        if (idx != arr.length) {
            dfs(idx + 1, st, sp, arr);
            dfs(idx + 1, st + arr[idx].time, sp + arr[idx].point, arr);
        }
    }

    static class Task {
        Integer time;
        Integer point;

        public Task(Integer time, Integer point) {
            this.time = time;
            this.point = point;
        }
    }
}
