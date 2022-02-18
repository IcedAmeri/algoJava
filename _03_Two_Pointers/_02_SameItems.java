package _03_Two_Pointers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class _02_SameItems {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();

        br.readLine();
        Arrays.asList(br.readLine().split(" ")).forEach(s -> list.add(Integer.parseInt(s)));
        br.readLine();
        Arrays.asList(br.readLine().split(" ")).forEach(s -> list.add(Integer.parseInt(s)));

        list.sort(Comparator.naturalOrder());
        Integer temp = 0;
        boolean isFirst = true;
        for (Integer integer : list) {
            if (!temp.equals(integer)) {
                temp = integer;
            } else {
                if (isFirst) {
                    System.out.print(temp);
                    isFirst = false;
                } else {
                    System.out.print(" " + temp);
                }
            }
        }
    }
}
