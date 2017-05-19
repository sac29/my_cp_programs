/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author sachin
 */
public class ABreapeat {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String tem[] = br.readLine().split(" ");
            long n=Long.parseLong(tem[0]);
            long k = Long.parseLong(tem[1]);
            String s = br.readLine();
            char ch[] = s.toCharArray();
            long cnta = 0, cntb = 0, c = 0;
            for (int i = 0; i<n ; i++) {
                if (ch[i] == 'a') {
                    cnta++;
                }
                if (ch[i] == 'b') {
                    cntb++;
                    c = c + cnta;
                }
            }
            
            long ans = 0;
            long d = cnta * cntb;
            if (k == 1) {
                System.out.println(c);
            } else {
                ans = (k * (2 * c + (k - 1) * d))/2;
                System.out.println(ans);
            }
        }
    }
}
