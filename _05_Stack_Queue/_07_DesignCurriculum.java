package _05_Stack_Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _07_DesignCurriculum {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String eClass = br.readLine();
        char[] eChars = eClass.toCharArray();

        String dClass = br.readLine();


        int eIdx = 0;
        boolean res = false;
        for (char d : dClass.toCharArray()) {
            if (eChars[eIdx] == d) {
                ++eIdx;
                if (eIdx == eChars.length) {
                    res = true;
                    break;
                }
            }
        }

        System.out.println(res ? "YES" : "NO");
    }
}
