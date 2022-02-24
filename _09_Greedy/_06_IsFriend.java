package _09_Greedy;

import java.util.Arrays;
import java.util.Scanner;

public class _06_IsFriend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        Integer[] arr = new Integer[n+1];
        Arrays.fill(arr, 0);

        int setNum = 1;
        for (int i = 0; i < m; ++i) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (setGroup(a, b, arr, setNum)) {
                ++setNum;
            }
        }

        int t1 = sc.nextInt();
        int t2 = sc.nextInt();


        if (arr[t1] == arr[t2] && arr[t1] != 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    static boolean setGroup(int a, int b, Integer[] arr, int setNum) {
        if (arr[a] == 0 && arr[b] == 0) {
            arr[a] = arr[b] = setNum;
            return true;
        } else if (arr[a] == 0 && arr[b] != 0) {
            arr[a] = arr[b];
        } else if (arr[a] != 0 && arr[b] == 0) {
            arr[b] = arr[a];
        } else {
            int gA = arr[a];
            int gB = arr[b];
            for (int i = 1; i < arr.length; ++i) {
                if (arr[i] == gA || arr[i] == gB) {
                    arr[i] = gA;
                }
            }
        }
        return false;
    }
}
