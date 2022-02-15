package _02_Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class _03_RSP {
    static String checkWin(String a, String b) {
        String res = "";
        if (a.equals(b)) {
            return "D";
        }
        switch (a) {
            case "1" : res = (Objects.equals(b, "2")) ? "B" : "A"; break;
            case "2" : res = (Objects.equals(b, "3")) ? "B" : "A"; break;
            case "3" : res = (Objects.equals(b, "1")) ? "B" : "A"; break;
        }
        return res;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        String[] s1 = br.readLine().split(" ");
        String[] s2 = br.readLine().split(" ");

        for (int i = 0; i < s1.length; ++i) {
            System.out.println(checkWin(s1[i], s2[i]));
        }
    }
}
