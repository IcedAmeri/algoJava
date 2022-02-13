package _02_Array;

import java.util.List;

public class _01_FindChar {
    public void solution(List<Integer> list) {
        System.out.print(list.get(0));
        for (int i = 1; i < list.size(); ++i) {
            if (list.get(i) > list.get(i-1)) {
                System.out.print(" " + list.get(i));
            }
        }
    }
}
