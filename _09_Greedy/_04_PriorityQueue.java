package _09_Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

// Time: 797ms Memory: 36MB Lang: Java 닉네임: 7d84390dfd394566b31b
public class _04_PriorityQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Schedule> arrS = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            arrS.add(new Schedule(sc.nextInt(), sc.nextInt()));
        }

        arrS.sort(Comparator.comparing(Schedule::getPay, Comparator.reverseOrder())
                .thenComparing(Schedule::getDueDate, Comparator.reverseOrder()));

        System.out.println(solve(arrS));
    }

    private static int solve(ArrayList<Schedule> arrS) {
        // Calc total dates
        int size = Integer.MIN_VALUE;
        for (Schedule s : arrS) {
            if (s.dueDate > size) {
                size = s.dueDate;
            }
        }

        Integer[] arrD = new Integer[size];
        Arrays.fill(arrD, 0);

        int sum = 0;
        int count = 0;
        for (Schedule s : arrS) {
            int idx = s.dueDate-1;
            for (int i = idx; i >= 0; --i) {
                if (arrD[i] == 0) {
                    arrD[i] = s.pay;
                    sum += s.pay;
                    ++count;
                    break;
                }
            }
            if (count >= size) {
                break;
            }
        }
        return sum;
    }

    static class Schedule {
        Integer pay;
        Integer dueDate;

        public Schedule(Integer pay, Integer dueDate) {
            this.pay = pay;
            this.dueDate = dueDate;
        }

        public Integer getPay() {
            return pay;
        }

        public Integer getDueDate() {
            return dueDate;
        }
    }
}
