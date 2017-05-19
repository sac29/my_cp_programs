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
 class MicroUpdate {
     public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
           int t= Integer.parseInt(br.readLine());
           while(t-->0){
               String tem[]=br.readLine().split(" ");
               int n=Integer.parseInt(tem[0]);
               int k=Integer.parseInt(tem[1]);
               String b[]=br.readLine().split(" ");
               int a[]=new int[n];
               for(int i=0;i<n;i++){
                   a[i]=Integer.parseInt(b[i]);
               }
               Arrays.sort(a);
//               for(int i:a)
//                System.out.print(i);
              // System.out.println(a[0]);
               int ans=k-a[0];
               if(ans<0)
                 System.out.println(0);
               else
                   System.out.println(ans);
           }
     }
}
