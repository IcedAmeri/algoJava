package _10_Dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _03_PartialIncrease {

    static int[] dy;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = Arrays.stream(br.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        dy = new int[n];

        solution(arr, n);
    }

    private static void solution(int[] arr, int n) {
        int max = 0;
        dy[0] = 1;
        dy[1] = 1;

        for (int i = 2; i < n; ++i) {
            int temp = 0;
            for (int j = 0; j < i; ++j) {
                if (arr[j] < arr[i] && dy[j] > temp) {
                    temp = dy[j];
                }
            }
            dy[i] = temp + 1;
            max = Math.max(max, dy[i]);
        }

        System.out.println(max);
    }
}
