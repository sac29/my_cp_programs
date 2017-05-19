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
class MonkANS {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String tem[] = br.readLine().split(" ");
        int n = Integer.parseInt(tem[0]);
        long x = Long.parseLong(tem[1]);
        String ar[] = br.readLine().split(" ");
        long ans[] = new long[n];
        for (int i = 0; i < n; i++) {
            ans[i] = Long.parseLong(ar[i]);
        }
        int count=0,flag=0;
        
        for(int i=0;i<n;i++){
            if(ans[i]<=x){
                count++;
            }
            else if(ans[i]>x && flag==1){
                break;
            }
            else if(ans[i]>x){
                flag=1;
                
            }
            
        }
        System.out.println(count);
    }
}
