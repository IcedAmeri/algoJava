package _06_SortingAndSearching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _01_SelectionSort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        int[] array = Arrays.stream(br.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        solve(array);
    }

    private static void solve(int[] array) {
        for (int i = 0; i < array.length - 1; ++i) {
            int minIndex = i;

            for (int j = i + 1; j < array.length; ++j) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            swap(array, minIndex, i);
        }

        Arrays.stream(array).forEach(v -> System.out.print(v + " "));
    }

    private static void swap(int[] array, int minIndex, int i) {
        int temp = array[minIndex];
        array[minIndex] = array[i];
        array[i] = temp;
    }
}
