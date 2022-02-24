package _10_Dynamic;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class _04_HighestTower {

    static int dy[];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dy = new int[n+1];

        ArrayList<Brick> arr = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            arr.add(new Brick(sc.nextInt(), sc.nextInt(), sc.nextInt()));
        }
        arr.sort(Comparator.comparing(Brick::getWidth, Comparator.reverseOrder()));

        solve(arr);
    }

    private static void solve(ArrayList<Brick> arr) {

        int max = 0;

        for (int i = 0; i < arr.size(); ++i) {
            // 무조건 자기 포함
            dy[i] = arr.get(i).height;

            // 자기보다 무게 낮은 친구들 중 max 값 확인
            int tempMax = 0;
            for (int j = 0; j < i; ++j) {
                if (arr.get(j).weight > arr.get(i).weight) {
                    if (dy[j] > tempMax) {
                        tempMax = dy[j];
                    }
                }
            }
            // max 값을 자기 자리에 +
            dy[i] += tempMax;

            // 모든 경우의 수 중 최고값 업데이트
            if (max < dy[i]) max = dy[i];
        }

        System.out.print(max);
    }

    static class Brick {
        Integer width;
        Integer height;
        Integer weight;

        public Brick(Integer width, Integer height, Integer weight) {
            this.width = width;
            this.height = height;
            this.weight = weight;
        }

        public Integer getWidth() {
            return width;
        }

        public Integer getHeight() {
            return height;
        }

        public Integer getWeight() {
            return weight;
        }
    }
}
