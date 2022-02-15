package _02_Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _02_Shown_Students {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        List<Integer> list = new ArrayList<>();
        Arrays.asList(br.readLine().split(" ")).forEach(s -> {
            list.add(Integer.parseInt(s));
        });

        int max = -1;
        int count = 0;
        for (Integer integer : list) {
            if (integer > max) {
                max = integer;
                count += 1;
            }
        }

        System.out.print(count);
    }
}
