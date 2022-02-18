package _03_Two_Pointers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _03_MaxMoney {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s1 = br.readLine().split(" ");
        int windowSize = Integer.parseInt(s1[1]);

        List<Integer> list = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        Arrays.asList(br.readLine().split(" ")).forEach(s -> list.add(Integer.parseInt(s)));

        Integer maxMoney = 0;
        int temp = 0;
        for (Integer integer : list) {
            queue.add(integer);
            temp += integer;

            if (queue.size() < windowSize) {
                continue;
            }

            if (queue.size() > windowSize) {
                temp -= queue.poll();;
            }

            if (maxMoney < temp ) {
                maxMoney = temp;
            }
        }

        System.out.print(maxMoney);
    }
}
