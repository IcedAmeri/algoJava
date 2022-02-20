package _10_Dynamic;

import java.util.Scanner;

public class _02_CrossRockBridge {

    static int dy[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dy = new int[n+2];

        System.out.println(solution(n));

    }

    private static int solution(int n) {
        dy[1] = 2;
        dy[2] = 3;

        for (int i = 3; i <= n; ++i) {
            dy[i] = dy[i-2] +dy[i-1];
        }

        return dy[n];
    }
}
