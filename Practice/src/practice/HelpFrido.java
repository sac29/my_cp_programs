/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class HelpFrido {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String ar[] = br.readLine().split(" ");
        long arr[] = new long[n + 2];
        for (int i = 0; i < n; i++) {
            arr[i] = Long.parseLong(ar[i]);
            // System.out.println(arr[i]);
        }
        double flo=0.0;
           for(int j=0;j<n;j++){
               flo=flo+Math.log(arr[j]);
           }
            double res;
           double res1=flo/n;
           double a=Math.exp(res1);
           res=1+Math.floor(a);
           System.out.println((int)res);
           
           
    }
     
   
    
}
