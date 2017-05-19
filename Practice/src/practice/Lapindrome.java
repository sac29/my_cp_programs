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
public class Lapindrome {
    public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         int t=Integer.parseInt(br.readLine());
         String s=br.readLine();
         char c[]=s.toCharArray();
         int ar1[]=new int[200];
         int ar2[]=new int[200];
         for(int j=0;j<(c.length)/2;j++){
             ar1[(int)c[j]]++;
         }
         for(int i=((c.length)/2)+1;i<c.length;i++){
             ar1[(int)c[i]]++;
             
         }
         
         for(int k=97;k<130;k++){
             System.out.println(ar1[k]);
             System.out.println(ar2[k]);
         }
    }
}



