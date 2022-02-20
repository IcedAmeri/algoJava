package _06_SortingAndSearching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _02_BubbleSort {
    public static void main(String[] args) throws IOException {
        _02_BubbleSort main = new _02_BubbleSort();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();

        int[] array = Arrays.stream(br.readLine().split("\\s+"))
                .mapToInt(Integer::valueOf)
                .toArray();

        main.solve(array);
        Arrays.stream(array).forEach(i -> {
            System.out.print(i + " ");
        });
    }

    private void solve(int[] array) {
        for (int i = array.length - 1; i > 0; --i) {
            for (int j = 0; j < i; ++j) {
                if (array[j] > array[j+1]) {
                    swap(array, j, j+1);
                }
            }
        }
    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
