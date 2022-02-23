package _03_Two_Pointers;

import java.util.Scanner;

public class _05_SumSequential {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int sum = 1;
        int count = 0;
        int s = 1;

        for (int i = s + 1; i < n; ++i) {
            sum = sum + i;
            while (sum > n) {
                sum -= s;
                ++s;
            }
            if (sum == n) {
                count++;
            }
        }

        System.out.print(count);
    }
}
