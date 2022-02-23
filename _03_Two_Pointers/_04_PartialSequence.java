package _03_Two_Pointers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _04_PartialSequence {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] nm = Arrays.stream(br.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int n = nm[0];
        int m = nm[1];

        int[] arr = Arrays.stream(br.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int s = 0;
        int sum = 0;
        int count = 0;

        for (int j : arr) {
            sum += j;
            while (sum > m) {
                sum -= arr[s];
                ++s;
            }

            if (sum == m) {
                ++count;
            }
        }

        System.out.println(count);
    }
}
