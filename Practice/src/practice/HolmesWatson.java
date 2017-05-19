/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;

/**
 *
 * @author sachin
 */
class HolmesWatson {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        HashSet<Integer> s = new HashSet<Integer>();
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String tem[] = br.readLine().split(" ");
            int Hi[] = new int[n];
            for (int i = 0; i < n; i++) {
                Hi[i] = Integer.parseInt(tem[i]);
            }
            Arrays.sort(Hi);
            int uni[] = new int[100001];
            for (int i = 0; i < n; i++) {
                uni[Hi[i]]++;
                s.add(Hi[i]);
            }
            int count = 0;
            for (int i = 0; i < 100000; i++) {
                if (uni[i] == 1) {
                    count++;
                }
            }
           
        }
    }
}
