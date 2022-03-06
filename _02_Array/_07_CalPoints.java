package _02_Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class _07_CalPoints {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        int[] arr = Arrays.stream(br.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int curPoint = 1;
        int tot = 0;
        for (int i : arr) {
            if (i == 1) {
                tot += curPoint;
                ++curPoint;
            } else {
                curPoint = 1;
            }
        }
        System.out.println(tot);
    }
}
