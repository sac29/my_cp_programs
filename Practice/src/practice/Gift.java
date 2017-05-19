/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author Sachin
 */
public class Gift {
     public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        Integer t = Integer.parseInt(br.readLine());
        for(int k=1;k<=t;k++){
            int n=Integer.parseInt(br.readLine());
            int a[]=new int[n];
            int b[]=new int[n];
            for(int i=1;i<=n-1;i++){
                String temp[]=br.readLine().split(" ");
                a[i]=Integer.parseInt(temp[0]);
                b[i]=Integer.parseInt(temp[1]);
            }
            int sum1=(n-1)*n/2;
            int sum2=0;
            for(int i=1;i<=n-1;i++){
                
                 sum2=sum2+b[i];
            }
            System.out.println(sum1-sum2);
        }
    }
             
}
