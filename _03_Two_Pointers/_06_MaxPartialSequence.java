package _03_Two_Pointers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;

public class _06_MaxPartialSequence {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] nk = Arrays.stream(br.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int k = nk[1];

        int[] arr = Arrays.stream(br.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        LinkedList<Integer> pList = new LinkedList<>();

        int currPoint = 0;
        int length = 0;
        int max = 0;

        for (int i : arr) {
            ++currPoint;
            if (i == 0) {
                if (pList.size() >= k) {
                    if (length > max) {
                        max = length;
                    }
                    Integer removed = pList.pollLast();
                    if (removed == null) {
                        System.out.println("removed is null");
                    } else {
                        length -= removed;
                    }
                }
                pList.push(currPoint);
                currPoint = 0;
            }
            ++length;
        }

        System.out.println(max);
    }
}
