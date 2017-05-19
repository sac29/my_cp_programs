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
public class LeadGame {
    public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         Integer n = Integer.parseInt(br.readLine());
         int a[]=new int[n];
         int b[]=new int[n];
         int c[]=new int[2*n];
         for(int i=0,j=0;i<n;i=i++,j=+2){
              if(a[i]>b[i]){
                  c[j]=1;
                  c[j+1]=a[i]-b[i];
              }
              else{
                  c[j]=2;
                  c[j+1]=a[i]-b[i];
                  }
         }
         int max=c[1];
             int lead=0;
         for(int i=2;i<=2*n;i=i+2){
             
             if(c[i+1]>max){
                 max=c[i+1];
                 lead=i;
             }
            
         }
          System.out.println(lead+" "+max);
         
    }
}
