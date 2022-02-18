package _05_Stack_Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _02_RemoveBetweenBracket {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split("");
        int inBracket = 0;

        for (String s : split) {
            if (s.equals("(")) {
                inBracket++;
            } else if (s.equals(")")) {
                inBracket--;
                continue;
            }

            if (inBracket == 0) {
                System.out.print(s);
            }
        }
    }
}
