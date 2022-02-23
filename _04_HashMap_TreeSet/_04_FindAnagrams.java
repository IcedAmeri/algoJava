package _04_HashMap_TreeSet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class _04_FindAnagrams {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> sList = Arrays.stream(br.readLine().split("")).collect(Collectors.toList());
        List<String> tList = Arrays.stream(br.readLine().split("")).collect(Collectors.toList());

        HashMap<String, Integer> hmT = new HashMap<>();
        HashMap<String, Integer> hmS = new HashMap<>();

        for (String s : tList) {
            hmT.merge(s, 1, Integer::sum);
        }

        int s = 0;
        int count = 0;

        for (int i = 0; i < sList.size(); ++i) {
            hmS.merge(sList.get(i), 1, Integer::sum);
            if (i < tList.size() - 1) {
                continue;
            } else {
                if (hmS.equals(hmT)) {
                    ++count;
                }
            }

            if (hmS.get(sList.get(s)) == 1) {
                hmS.remove(sList.get(s));
            } else {
                hmS.merge(sList.get(s), -1, Integer::sum);
            }
            ++s;
        }

        System.out.println(count);
    }
}
