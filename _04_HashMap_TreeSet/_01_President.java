package _04_HashMap_TreeSet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// Time: 263ms Memory: 33MB Lang: Java 닉네임: 7d84390dfd394566b31b
public class _01_President {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        List<String> list = Arrays.asList(br.readLine().split(""));

        HashMap<String, Integer> hm = new HashMap<>();
        list.forEach(s -> {
            if (hm.containsKey(s)) {
                hm.replace(s, hm.get(s) + 1);
            } else {
                hm.put(s, 1);
            }
        });

        Optional<Map.Entry<String, Integer>> max = hm.entrySet().stream().max(Comparator.comparingInt(Map.Entry::getValue));
        System.out.println(max.get().getKey());
    }
}
