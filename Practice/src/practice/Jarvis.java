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
public class Jarvis {
    public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         int t = Integer.parseInt(br.readLine());
         for(int i=1;i<=t;i++){
             
             int N=Integer.parseInt(br.readLine());
             int count[]=new int[11];
             String num[]=br.readLine().split(" ");
           
             for(int j=0;j<N;j++){
                 int n=Integer.parseInt(num[j]);
                 if(n==1)
                     count[n]=2;
                 else if(n==2)
                     count[n]=5;
                 else if(n==3)
                     count[n]=5;
                 else if(n==4)
                      count[n]=4;
                 else if(n==5)
                     count[n]=5;
                 else if(n==6)
                     count[n]=6;
                  else if(n==7)
                     count[n]=3;
                 else if(n==8)
                     count[n]=7;
                 else if(n==9)
                      count[n]=6;
                 else if(n==0)
                     count[n]=6;
               
                 
             }
            int min=10;
             for(int k=0;k<=N;k++){
                  if(count[k]==0)
                      continue;
                  else if(min>count[k])
                      min=k;
                              
             }
             System.out.println(min);
         }
    }
}
