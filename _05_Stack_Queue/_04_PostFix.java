package _05_Stack_Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class _04_PostFix {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();

        Stack<Integer> stack = new Stack<>();

        for (char c : line.toCharArray()) {
            switch (c) {
                case '-': {
                    Integer rValue = stack.pop();
                    Integer lValue = stack.pop();
                    stack.push(lValue - rValue);
                    break;
                }
                case '+': {
                    stack.push(stack.pop() + stack.pop());
                    break;
                }
                case '*': {
                    stack.push(stack.pop() * stack.pop());
                    break;
                }
                case '/': {
                    Integer rValue = stack.pop();
                    Integer lValue = stack.pop();
                    stack.push(lValue / rValue);
                    break;
                }
                default: {
                    stack.push(Integer.parseInt(c + ""));
                }
            }
        }

        System.out.println(stack.pop());
    }
}
