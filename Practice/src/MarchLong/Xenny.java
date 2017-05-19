/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package MarchLong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Sachin
 */
public class Xenny {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-->0){
            long sum1=0;
            long sum2=0;
            int n=Integer.parseInt(br.readLine());
            String x[]=br.readLine().split(" ");
            String y[]=br.readLine().split(" ");
            for(int i=0;i<x.length;i++){
                if(i%2==0){
                    sum1=sum1+Integer.parseInt(x[i]);
                }
                else
                    sum1=sum1+Integer.parseInt(y[i]);
            }
            for(int i=0;i<x.length;i++){
                if(i%2==0){
                    sum2=sum2+Integer.parseInt(y[i]);
                }
                else
                    sum2=sum2+Integer.parseInt(x[i]);
            }
             if(sum1<sum2)
                System.out.println(sum1);
             else
                System.out.println(sum2);
                
        }
    }
}
