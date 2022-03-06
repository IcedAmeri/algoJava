package _10_Dynamic;

import java.util.Arrays;
import java.util.Scanner;

public class _06_GetMaxPoint_NapSack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[m+1];
        Arrays.fill(arr, 0);

        for (int i = 0; i < n; ++i) {
            int point = sc.nextInt();
            int time = sc.nextInt();

            for (int j = m; j >= time; --j) {
                arr[j] = Math.max(arr[j], arr[j-time] + point);
            }
        }
        System.out.println(arr[m]);
    }
}
