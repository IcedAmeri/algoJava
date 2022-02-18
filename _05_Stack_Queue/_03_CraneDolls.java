package _05_Stack_Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class _03_CraneDolls {
    static void solve(List<LinkedList<Integer>> container, List<Integer> moves) {

        Stack<Integer> box = new Stack<>();

        int count = 0;
        for (Integer move : moves) {
            if (!container.get(move).isEmpty()) {
                Integer item = container.get(move).pollLast();
                if (!box.isEmpty()) {
                    if (box.peek().equals(item)) {
                        box.pop();
                        count++;
                        continue;
                    } else {
                        box.push(item);
                    }
                } else {
                    box.push(item);
                }
            }
        }

        System.out.print(count * 2);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<LinkedList<Integer>> board = new ArrayList<>();

        for (int i = 0; i < n; ++i) {
            LinkedList<Integer> list = new LinkedList<>();
            board.add(list);
        }

        for (int i = 0; i < n; ++i) {
            List<String> list = Arrays.asList(br.readLine().split(" "));
            for (int j = 0; j < list.size(); ++j) {
                int item = Integer.parseInt(list.get(j));
                if (item != 0) board.get(j).addFirst(item);
            }
        }

        br.readLine();
        List<Integer> moves = new ArrayList<>();
        Arrays.asList(br.readLine().split(" ")).forEach(s -> {
            int i = Integer.parseInt(s);
            moves.add(i-1);
        });

        solve(board, moves);
    }
}
