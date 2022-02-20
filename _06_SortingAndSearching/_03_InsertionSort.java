package _06_SortingAndSearching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _03_InsertionSort {
    public static void main(String[] args) throws IOException {
        _03_InsertionSort main = new _03_InsertionSort();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        int[] array = Arrays.stream(br.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        main.solve(array);

        Arrays.stream(array).forEach(ints -> {
            System.out.print(ints + " ");
        });
    }

    private void solve(int[] array) {
        for (int i = 1; i < array.length; ++i) {
            int temp = array[i];
            int j;
            for (j = i - 1; j >= 0; --j) {
                if (temp < array[j]) {
                    array[j + 1] = array[j];
                } else break;
            }
            array[j + 1] = temp;
        }
    }
}
