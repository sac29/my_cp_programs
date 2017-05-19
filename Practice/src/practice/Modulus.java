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
 * @author sachin
 */
public class Modulus {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        outer:
        while (t-->0) {            
            int n=Integer.parseInt(br.readLine());
            String tem[]=br.readLine().split(" ");
            int a[]=new int[n];
            for(int i=0;i<n;i++){
               // System.out.println(tem[i]);
                a[i]=Integer.parseInt(tem[i]);
              //  System.out.println(a[i]);
        }
             
             
            Arrays.sort(a);
            for(int i=n-1;i>=0;i--){
                if(a[i]!=a[n-1]){
                    System.out.println(a[i]);
                    continue outer;
                }
            }
            System.out.println(0);
        }
            
            
        }
    }

