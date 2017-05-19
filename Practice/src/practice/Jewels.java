package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Jewels {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        int count = 0;
        for (int c = 1; c <= t; c++) {
            count = 0;
            String jew = br.readLine();
            char j[] = jew.toCharArray();
            String stone = br.readLine();
            char s[] = stone.toCharArray();
            for (int i = 0; i < s.length; i++) {
                for (int k = 0; k < j.length; k++) {
                    char a = s[i];
                    char b = j[k];
                    if (a == b) {
                        count++;
                      break;
                    }

                }

            }
            System.out.println(count);
        }
    }
}
