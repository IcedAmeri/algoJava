package _10_Dynamic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class _05_ExchangeCoins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> coins = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            coins.add(sc.nextInt());
        }
        coins.sort(Comparator.naturalOrder());

        int m = sc.nextInt();
        Integer[] arr = new Integer[m + 1];
        Arrays.fill(arr, Integer.MAX_VALUE);
        arr[0] = 0;

        for (int c : coins) {
            for (int j = c; j <= m; ++j) {
                arr[j] = Math.min(arr[j], arr[j - c] + 1);
            }
        }

        System.out.println(arr[m]);
    }
}
