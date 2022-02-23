package _01_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _04_ReverseWord {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; ++i) {
            String[] split = br.readLine().split("");
            for (int j = split.length; j > 0; --j) {
                System.out.print(split[j-1]);
            }
            System.out.println();
        }
    }
}
