package _09_Greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class _07_WonderLand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int v = sc.nextInt();
        int e = sc.nextInt();

        RoadInfo[] roadArr = new RoadInfo[e];
        int[] cityArr = new int[v+1];

        for (int i = 0; i < e; ++i) {
            int ca = sc.nextInt();
            int cb = sc.nextInt();
            int cost = sc.nextInt();
            roadArr[i] = new RoadInfo(ca, cb, cost);
        }
        Arrays.sort(roadArr, Comparator.comparing(RoadInfo::getCost));

        for (int i = 0; i < cityArr.length; ++i) {
            cityArr[i] = i;
        }

        int sum = 0;
        for (RoadInfo ri : roadArr) {
            int f1 = Find(ri.getCityA(), cityArr);
            int f2 = Find(ri.getCityB(), cityArr);

            if (f1 != f2) {
                sum += ri.getCost();
                Union(ri.getCityA(), ri.getCityB(), cityArr);
            }
        }

        System.out.println(sum);
    }

    public static void Union(int a, int b, int[] unf) {
        int fa = Find(a, unf);
        int fb = Find(b, unf);
        if (fa != fb) unf[fa] = fb;
    }

    private static int Find(int v, int[] unf) {
        if (v == unf[v]) return v;
        else return unf[v] = Find(unf[v], unf);
    }


    static class RoadInfo {
        private int cityA;
        private int cityB;
        private int cost;

        public RoadInfo(int cityA, int cityB, int cost) {
            this.cityA = cityA;
            this.cityB = cityB;
            this.cost = cost;
        }

        public int getCityA() {
            return cityA;
        }

        public int getCityB() {
            return cityB;
        }

        public int getCost() {
            return cost;
        }
    }
}
