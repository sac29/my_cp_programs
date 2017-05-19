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
public class Digit {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s[] = br.readLine().split(" ");
        char a[] = s[0].toCharArray();
        long k = Long.parseLong(s[1]);
       
      //  System.out.println(k);
        for (int i = 0; i < k; i++) {
            if (a[i] == '9') {
                k++;
            } else {
                a[i] = '9';
            }

        }
        for (int j = 0; j < a.length; j++) {
            System.out.print(a[j]);
        }

    }
}
