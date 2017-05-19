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
public class Stipendium {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
       
        for(int i=1;i<=t;i++){
         int sub=Integer.parseInt(br.readLine());
        // int A[]=new int[sub];
         int sum=0;
          String temp[]=br.readLine().split(" ");
            for(int j=0;j<sub;j++){
                sum=sum+Integer.parseInt(temp[j]);
            }
            if(sum/sub>=4){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}
