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
 class TheLeadGame {
     public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int pl1[]=new int[n+1];
        int pl2[]=new int[n+1];
        for(int i=0;i<n;i++){
            String tem[]=br.readLine().split(" ");
            pl1[i]=Integer.parseInt(tem[0]);
            pl2[i]=Integer.parseInt(tem[1]);
            
        }
       
        int p1lead=0,p2lead=0;
       int p1cum=0,p2cum=0;
        for(int i=0;i<n;i++){
               p1cum+=pl1[i];
               p2cum+=pl2[i];
              int a=p1cum-p2cum;
            if(a>0){
                p1lead=a>p1lead ? a:p1lead;
                
            }
            else if(a<0)
            {
               p2lead=Math.abs(a)>p2lead ? Math.abs(a):p2lead;
            }
            
        }
         if(p1lead>p2lead){
             System.out.println("1 "+p1lead);
         }
         else
             System.out.println("2 "+p2lead);
     }
}
