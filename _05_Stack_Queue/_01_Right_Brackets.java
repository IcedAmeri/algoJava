package _05_Stack_Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

// Time: 88ms Memory: 26MB Lang: Java 닉네임: 7d84390dfd394566b31b
public class _01_Right_Brackets {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = Arrays.asList(br.readLine().split(""));

        int i = 0;
        for (String s : list) {
            if (s.equals("(")) {
                ++i;
            } else {
                if (i <= 0) {
                    System.out.println("NO");
                    return;
                }
                --i;
            }
        }
        if (i == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
