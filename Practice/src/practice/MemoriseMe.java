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
 class MemoriseMe {
     public static void main(String[] args) throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
           int n= Integer.parseInt(br.readLine());
           String tem[]=br.readLine().split(" ");
           int ar[]=new int[1001];
           for(int i=0;i<n;i++){
               int k=Integer.parseInt(tem[i]);
               ar[k]++;
           }
          int q=Integer.parseInt(br.readLine());
          for(int j=1;j<=q;j++){
              int l=Integer.parseInt(br.readLine());
              if(ar[l]>0){
                  System.out.println(ar[l]);
              }
              else
                  System.out.println("NOT PRESENT");
          }
     }
}
