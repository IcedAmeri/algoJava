package _02_Array;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class _05_PrimeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        HashMap<Integer, Integer> map = new HashMap();

        for (int i = 2; i <= n; ++i) {
            if (isPrime(i)) {
                map.merge(1, 1, Integer::sum);
            }
        }

        System.out.println(map.get(1));
    }

    static boolean isPrime(int number) {
        int num = (int) Math.sqrt(number);
        for (int i = 2; i <= num; ++i) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
