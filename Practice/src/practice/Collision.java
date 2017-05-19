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
public class Collision {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
      
        for(int k=1;k<=t;k++){
            int count=0;
            int sum;
            String temp[]=br.readLine().split(" ");
            int n=Integer.parseInt(temp[0]);
            int m=Integer.parseInt(temp[1]);
              int A[][]=new int[n][m];
              for(int i=1;i<=n;i++){
                  int g=Integer.parseInt(br.readLine());
                  for(int j=m;j>=0;j++){
                      int d=g%10;
                    
                      A[i][j]=d;
                        g/=10;
                  }
//                  System.out.println("\n");
              }
               for(int i=0;i<n;i++){
                  int g=Integer.parseInt(br.readLine());
                  for(int j=0;j<m;j++){
                    
                      System.out.println(A[i][j]);
                  }
              
              
//            for(int j=0;j<m;j++){
//                sum=0;
//                for(int i=0;i<n;j++){
//                   sum=sum+A[i][j];
//                }
//               if(sum>2){
//                   count=count+sum;
//               } 
//               else if(sum==2){
//                   count+=1;
//               }
            }
            
            System.out.println(count); 
        }
        
    }
}
