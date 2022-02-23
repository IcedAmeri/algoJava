package _05_Stack_Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _05_IronStick {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        char prev = ')';
        int num = 0;
        int count = 0;

        for (char c : input.toCharArray()) {
            if (prev == ')' && c == ')') {
                count += 1;
                --num;
            } else if (prev == '(' && c == '(') {
                ++num;
            } else if (prev == '(' && c == ')') {
                count += num;
            }
            prev = c;
        }

        System.out.print(count);
    }
}
