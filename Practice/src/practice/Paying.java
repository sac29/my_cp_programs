/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Paying {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) { 
            int n=sc.nextInt();
            int k=sc.nextInt();
             int a[]=new int[n+1];
             for(int i=0;i<n;i++)a[i]=sc.nextInt();
              int cur=0;
             for(int i=0;i<n;i++){
                cur=a[i];
             for(int j=i+1;j<=n;j++){
                 if(cur==k)
                     break;
                 cur=cur+a[j];
             }
             if(cur==k)
                 break;
        }
            if(cur==k)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
         
    }
   
}
