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
public class PrimeGen {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String a[] = br.readLine().split(" ");
            int m = Integer.parseInt(a[0]);
            int n = Integer.parseInt(a[1]);
            if (m == 1 || m % 2 == 0) {
                if (m == 2) {
                    System.out.println(2);
                    m = 3;
                } else if (m == 1 && n > 1) {
                    System.out.println(2);
                    m = 3;
                } else {
                    m++;
                }
            }
            for (int i = m; i <= n; i += 2) {
                boolean prime = true;
                if (i % 2 == 0) {
                    prime = false;
                } else {
                    for (int j = 3; j <=(Math.sqrt(i)); j += 2) {
                        if (i % j == 0) {
                            prime = false;
                            break;

                        }

                    }
                }
                if (prime) {
                    System.out.println(i);
                }

            }
            System.out.println();
        }
    }
}
