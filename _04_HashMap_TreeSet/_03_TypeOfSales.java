package _04_HashMap_TreeSet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.*;
import java.util.stream.IntStream;

public class _03_TypeOfSales {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        Queue<Integer> window = new LinkedList<>();

        String[] s = br.readLine().split(" ");
        int size = Integer.parseInt(s[1]);
        Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).forEach(list::add);

        boolean isFirst = true;
        for (Integer integer : list) {
            if (hm.containsKey(integer)) {
                hm.replace(integer, hm.get(integer), hm.get(integer) + 1);
            } else {
                hm.put(integer, 1);
            }
            window.add(integer);

            if (window.size() < size) {
                continue;
            } else if (window.size() > size) {
                Integer poll = window.poll();
                hm.replace(poll, hm.get(poll), hm.get(poll) - 1);
                if (hm.get(poll) == 0) {
                    hm.remove(poll);
                }
            }

            if (isFirst) {
                System.out.print(hm.keySet().size());
                isFirst = false;
            } else {
                System.out.print(" " + hm.keySet().size());
            }
        }
    }
}
