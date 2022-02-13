import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt1 = Integer.parseInt(br.readLine());
        String[] ary1 = br.readLine().split(" ");
        int cnt2 = Integer.parseInt(br.readLine());
        String[] ary2 = br.readLine().split(" ");

        List<Integer> list = new ArrayList<>();
        Arrays.asList(ary1).forEach(s -> list.add(Integer.parseInt(s)));
        Arrays.asList(ary2).forEach(s -> list.add(Integer.parseInt(s)));

        list.sort(Comparator.naturalOrder());
        System.out.print(list.get(0));
        list.stream().skip(1).forEach(s -> System.out.print(" " + s));
    }
}