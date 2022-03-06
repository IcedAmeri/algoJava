package _06_SortingAndSearching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _06_MischievousBoy {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        int[] arr = Arrays.stream(br.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int tempIdx = 0;
        int tempValue = 0;
        int c = 0, p = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] > tempIdx) {
                tempIdx = arr[i];
                if (i > 1) {
                    if (!hm.containsKey(arr[i-1])) {
                        hm.put(arr[i - 1], i);
                    }
                }
            } else if (arr[i] < tempIdx) {
                if (c == 0) {
                    c = i;
                    tempValue = arr[i];
                } else {
                    p = i + 1;
                }
            }
        }

        if (p == 0) {
            System.out.println((hm.get(tempValue)+1) + " " + (c+1));
        } else {
            System.out.println(c + " " + p);
        }
    }
}
