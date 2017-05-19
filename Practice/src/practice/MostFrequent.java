/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 *
 * @author Sachin
 */
 class MostFrequent {
     public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();  
        int n = Integer.parseInt(br.readLine());
        String ar[] = br.readLine().split(" ");
        int arr[] = new int[n + 1];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(ar[i]);
        }
        for(int i = 0; i < n; i++ ){
            hm.put(arr[i], 0);
        }
        for(int i = 0; i < n; i++ ){
            int k=hm.get(arr[i]);
            hm.put(arr[i],k+1);
        }
        int max=Integer.MIN_VALUE;
        int a=0;
        for(int i = 0; i < n; i++ ){
            int k=hm.get(arr[i]);
            if(max<k){
                max=k;
                a=arr[i];
            }
        }
         System.out.println(a);
     }
}
