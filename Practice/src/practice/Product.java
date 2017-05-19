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

/**
 *
 * @author Sachin
 */
public class Product {
    public static void main(String[] args) throws IOException {
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         int n=Integer.parseInt(br.readLine());
         String a[]=br.readLine().split(" ");
         long ans=1;
         long mod=((long)Math.pow(10, 9)+7);
         
         for(int i=0;i<n;i++){
              ans=ans*Integer.parseInt(a[i])%mod;
           }
         System.out.println(ans);
    }
}
