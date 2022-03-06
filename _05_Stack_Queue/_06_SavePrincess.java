package _05_Stack_Queue;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class _06_SavePrincess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        List<Integer> list = new LinkedList<>();

        for (int i = 1; i <= n; ++i) {
            list.add(i);
        }

        int cnt = 0;
        int idx = 0;
        while (list.size() > 1) {
            cnt++;

            if (cnt % k == 0) {
                list.remove(idx);
                cnt = 0;
                if (idx == 0) {
                    idx = list.size()-1;
                } else {
                    --idx;
                }
            }

            if (idx >= list.size() - 1) {
                idx = 0;
            } else {
                ++idx;
            }
        }

        System.out.println(list.get(0));
    }
}
