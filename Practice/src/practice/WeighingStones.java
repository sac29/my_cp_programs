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
class WeighingStones {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String ru[] = br.readLine().split(" ");
            String an[] = br.readLine().split(" ");
            int rupF[] = new int[101];
            int anF[] = new int[101];
            for (int i = 0; i < n; i++) {
                int k = Integer.parseInt(ru[i]);
                int l = Integer.parseInt(an[i]);
                rupF[k]++;
                anF[l]++;
            }
           
            int maxRU = Integer.MIN_VALUE;
            int maxAN = Integer.MIN_VALUE;
            int maxrup=Integer.MIN_VALUE,maxank=Integer.MIN_VALUE;
            for (int j =100;j>=0; j--) {
                if (maxRU < rupF[j] ) {
                    maxRU = rupF[j];
                    maxrup=j;
                }
            }
            for (int j =100;j>=0; j--) {
                if (maxAN < anF[j]) {
                    maxAN = anF[j];
                    maxank=j;
                }
            }
           
            if (maxank > maxrup) {
                System.out.println("Ankit");
            
            } else if (maxrup> maxank) {
                System.out.println("Rupam");
            } else if(maxrup==maxank){
                System.out.println("Tie");
                

            }
        }
    }
}
