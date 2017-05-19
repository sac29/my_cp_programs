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
public class Ammo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            String tem[]=br.readLine().split(" ");
            int A=Integer.parseInt(tem[0]);
            int N=Integer.parseInt(tem[1]);
            String ar[]=br.readLine().split(" ");
            int obs[]=new int[N+2];
            for(int i=1;i<=N;i++){
                obs[i]=Integer.parseInt(ar[i-1]);
                //System.out.println(obs[i]);
            }
            int flag=0;
            for(int j=1;j<=N;j++){
                if(obs[j]==1){
                    A=A+3-1;
                }
                else if(obs[j]==0){
                    A=A-1;
                }
                if(A<=0 && j!=N){
                    System.out.println("No "+j);
                    flag=1;
                    break;
                }
                else if(A==0 && j==N){
                    System.out.println("Yes "+A);
                    flag=1;
                    break;
                }
                
            }
            if(flag==0){
                System.out.println("Yes "+A);
            }
            
            
        }
    }
}
