package _09_Greedy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class _02_ConferenceRoom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Conference> list = new ArrayList<>();

        for (int i = 0; i < n; ++i) {
             list.add(new Conference(sc.nextInt(), sc.nextInt()));
        }

        solve(list);
    }

    private static void solve(ArrayList<Conference> list) {
        list.sort(Comparator.comparingInt(o -> o.endTime));

        Conference temp = list.get(0);
        int count = 1;

        for (Conference conference : list) {
            if (conference.startTime >= temp.endTime) {
                temp = conference;
                count ++;
            }
        }

        System.out.println(count);
    }

    static class Conference {
        int startTime;
        int endTime;

        public Conference(int startTime, int endTime) {
            this.startTime = startTime;
            this.endTime = endTime;
        }
    }
}
