package _06_SortingAndSearching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _04_LeastRecentlyUsed {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] sn = Arrays.stream(br.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int cacheSize = sn[0];

        int[] arr = Arrays.stream(br.readLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        LinkedList<Integer> list = new LinkedList<>();

        for (int task : arr) {
            int idx = findIdxFromCache(list, task);
            if (idx == -1) {
                // Cache Miss
                list.addFirst(task);
            } else {
                // Cache Hit
                Integer removed = list.remove(idx);
                list.addFirst(removed);
            }

            if (list.size() > cacheSize) {
                list.pollLast();
            }
        }

        printResult(list);
    }

    private static void printResult(LinkedList<Integer> list) {
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }

    private static int findIdxFromCache(List<Integer> list, int task) {
        int idx = 0;
        for (Integer integer : list) {
            if (integer == task) {
                return idx;
            } else {
                idx += 1;
            }
        }
        return -1;
    }
}
