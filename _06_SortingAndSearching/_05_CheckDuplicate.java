package _06_SortingAndSearching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// Time: 671ms Memory: 82MB Lang: Java 닉네임: 7d84390dfd394566b31b
public class _05_CheckDuplicate {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[10000001];
        Arrays.fill(arr, 0);
        int[] input = Arrays.stream(br.readLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        boolean isUnique = true;
        for (int i : input) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                isUnique = false;
                break;
            }
        }

        if (isUnique)
            System.out.print("U");
        else
            System.out.print("D");
    }
}
