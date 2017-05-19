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
class DRS {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            float over[] = new float[n];
            for (int i = 0; i < n; i++) {
                over[i] = Float.parseFloat(br.readLine());
            }
            int review = 0, count = 0;
            int ar[]=new int[1001];
            for (int i = 0; i < n; i++) {
                int a = (int) over[i] / 80;
                 ar[a]++;
            }
           
            for(int i=0;i<=1000;i++){
                if(ar[i]==0 || ar[i]==1||ar[i]==2)
                    count=count+ar[i];
                else if(ar[i]>2){
                    count=count+2;
                }
            }
            
            System.out.println(count);
        }
    }
}
