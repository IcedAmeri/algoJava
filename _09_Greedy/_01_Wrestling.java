package _09_Greedy;

import java.util.*;

public class _01_Wrestling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Person> arr = new ArrayList<>();

        for (int i = 0; i < n; ++i) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            arr.add(new Person(h, w));
        }

        solve(arr, n);
    }

    private static void solve(ArrayList<Person> arr, int n) {

        arr.sort(Comparator.comparingInt(o -> -o.height));
        Integer temp = arr.get(0).weight;
        int count = 1;

        for (Person person : arr) {
            if (person.weight > temp) {
                count++;
                temp = person.weight;
            }
        }

        System.out.print(count);
    }

    static class Person {
        Integer height;
        Integer weight;

        public Person(Integer height, Integer weight) {
            this.height = height;
            this.weight = weight;
        }
    }

}
