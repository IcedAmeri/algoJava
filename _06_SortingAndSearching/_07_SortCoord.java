package _06_SortingAndSearching;

import java.util.*;

public class _07_SortCoord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Coord[] arr = new Coord[n];

        for (int i = 0; i < n; ++i) {
            arr[i] = new Coord(sc.nextInt(), sc.nextInt());
        }

        Arrays.sort(arr, Comparator.comparing(Coord::getX)
                .thenComparing(Coord::getY));

        for (Coord coord : arr) {
            System.out.println(coord.x + " " + coord.y);
        }
    }

    static class Coord {
        int x;
        int y;

        public Coord(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }
}
