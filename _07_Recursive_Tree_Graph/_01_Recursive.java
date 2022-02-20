package _07_Recursive_Tree_Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _01_Recursive {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(br.readLine());

        _01_Recursive main = new _01_Recursive();
        main.solve(i);
    }

    void solve(int i) {
        if (i > 0) {
            solve(i-1);
            System.out.print(i + " ");
        }
    }
}
