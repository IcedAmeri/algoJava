package _04_HashMap_TreeSet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class _02_Anagram {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> hm = new HashMap<>();
        boolean res = true;

        Arrays.asList(br.readLine().split("")).forEach(s -> {
            if (hm.containsKey(s)) {
                hm.replace(s, hm.get(s), hm.get(s)+1);
            } else {
                hm.put(s, 1);
            }
        });

        List<String> second = Arrays.asList(br.readLine().split(""));

        for (String s : second) {
            if (hm.containsKey(s)) {
                hm.replace(s, hm.get(s), hm.get(s)-1);
                if (hm.get(s) == 0) {
                    hm.remove(s);
                }
            } else {
                res = false;
                break;
            }
        }

        if (!res || !hm.isEmpty()) {
            System.out.print("NO");
        } else {
            System.out.print("YES");
        }
    }
}
