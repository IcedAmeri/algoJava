package _09_Greedy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class _03_Marriage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<TimeLine> arr = new ArrayList<>();

        for (int i = 0; i < n; ++i) {
            int startTime = sc.nextInt();
            int endTime = sc.nextInt();

            arr.add(new TimeLine(startTime, VISIT_STATE.START));
            arr.add(new TimeLine(endTime, VISIT_STATE.END));
        }

        solve(arr);
    }

    private static void solve(ArrayList<TimeLine> arr) {
        arr.sort((o1, o2) -> compare(o1, o2));

        int max = 0;
        int count = 0;

        for (TimeLine timeLine : arr) {
            if (timeLine.state == VISIT_STATE.END) {
                if (max < count) {
                    max = count;
                }
                --count;
            } else if (timeLine.state == VISIT_STATE.START) {
                ++count;
            }
        }

        System.out.println(max);
    }

    private static int compare(TimeLine o1, TimeLine o2) {
        if (o1.time == o2.time) {

            if (o1.state == VISIT_STATE.START && o2.state == VISIT_STATE.END) {
                return 1;
            } else if (o1.state == VISIT_STATE.END && o2.state == VISIT_STATE.START) {
                return -1;
            } else {
                return 0;
            }
        } else {
            return o1.time - o2.time;
        }
    }

    static class TimeLine {
        int time;
        VISIT_STATE state;

        public TimeLine(int time, VISIT_STATE state) {
            this.time = time;
            this.state = state;
        }
    }

    enum VISIT_STATE {
        START,
        END
    }
}
