package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CyclicShift {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String temp[] = br.readLine().split(" ");
            int n = Integer.parseInt(temp[0]);
            int q = Integer.parseInt(temp[1]);
            String s = br.readLine();
            char c[] = s.toCharArray();
            for (int i = 1; i <= c.length; i++) {
                String tem[] = br.readLine().split(" ");
                int l = Integer.parseInt(tem[0]);
                int r = Integer.parseInt(tem[1]);
                for (int j = l; j <= r; j++) {
                    c[j - 1] = (char) ('a' + (((c[j - 1] - 'a' - 1) + 26) % 26));
                }
            }
            for (int i = 0; i < c.length; i++) {
                System.out.print(c[i]);
            }
        }

    }
}
