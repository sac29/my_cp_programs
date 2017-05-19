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
class LongATM {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String ar[] = br.readLine().split(" ");
        int per[] = new int[n + 1];
        for (int i = 0; i < n; i++) {
            per[i] = Integer.parseInt(ar[i]);
        }
        int count=1;
        for(int i=0;i<n-1;i++){
            if(per[i]>per[i+1]){
                count++;
            }
        }
        System.out.println(count);
    }
}
