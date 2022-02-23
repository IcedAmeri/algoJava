package _04_HashMap_TreeSet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _05_MaxNumberK {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] nk = Arrays.stream(br.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int n = nk[0];
        int k = nk[1];

        int[] arr = Arrays.stream(br.readLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        TreeSet<Integer> set = new TreeSet<>(Comparator.reverseOrder());

        makeTreeSet(n, arr, set);
        printResult(k, set);
    }

    private static void printResult(int k, TreeSet<Integer> set) {
        if (set.size() < k) {
            System.out.print(-1);
        } else {
            int index = 0;
            for (Integer integer : set) {
                index++;
                if (index == k) {
                    System.out.print(integer);
                }
            }
        }
    }

    private static void makeTreeSet(int n, int[] arr, TreeSet<Integer> set) {
        for (int i = 0; i < n -2; ++i) {
            for (int j = i+1; j < n -1; ++j) {
                for (int l = j+1; l < n; ++l) {
                    set.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }
    }
}
