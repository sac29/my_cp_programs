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
 * @author Sachin
 */
class BinaryQ {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String tem[] = br.readLine().split(" ");
        int n = Integer.parseInt(tem[0]);
        int q = Integer.parseInt(tem[1]);
        String st[] = br.readLine().split(" ");
        for (int j = 1; j <= q; j++) {
            String qr[] = br.readLine().split(" ");
            if (qr.length == 2) {
                int k = Integer.parseInt(qr[1]);
                k -= 1;
                if (st[k] == "1") {
                    st[k] = "0";
                } else {
                    st[k] = "1";
                }
            } else {

                int m = Integer.parseInt(qr[2]);
                m -= 1;
                if (st[m] == "0") {
                    System.out.println("EVEN");
                } else {
                    System.out.println("ODD");
                }

            }
        }

    }
}
