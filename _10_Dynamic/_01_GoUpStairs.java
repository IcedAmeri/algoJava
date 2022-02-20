package _10_Dynamic;

import java.util.Scanner;

public class _01_GoUpStairs {

    static int[] dy;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        dy = new int[n+1];

        int res = solution(n);
        System.out.println(res);
    }

    static int solution(int n) {
        dy[1] = 1;
        dy[2] = 2;

        for (int i = 3; i <= n; ++i) {
            dy[i] = dy[i-2] + dy[i-1];
        }
        return dy[n];
    }
}
