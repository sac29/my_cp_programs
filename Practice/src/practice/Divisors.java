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
public class Divisors {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         String a[]=br.readLine().split(" ");
         int l=Integer.parseInt(a[0]);
         int r=Integer.parseInt(a[1]);
         int k=Integer.parseInt(a[2]);
         int count=0;
         for(int i=l;i<=r;i++){
             if(i%k==0){
                 count++;
             }
         }
         System.out.println(count);
    }
}
