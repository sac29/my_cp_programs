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

/**
 *
 * @author Sachin
 */
public class Race {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
    
        String[] arr = br.readLine().split(" ");
        int[] intarr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            intarr[i] = Integer.parseInt(arr[i]);
        }
        for (int i = 1; i <= t; i++) {
            int min = Integer.MAX_VALUE;
            Arrays.sort(intarr);
            for (int j = 0; j < intarr.length - 1; j++) {
                int a = (intarr[j]) - (intarr[j + 1]);
                if (a < 0) a = a * -1;
                
                if (a < min) 
                    min = a;
                
            }
            System.out.println(min);
        }
    }
}
