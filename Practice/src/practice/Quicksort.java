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
public class Quicksort {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       PrintWriter out=new PrintWriter(System.out);
       int t=Integer.parseInt(br.readLine());
        int a[]=new int[t+1];
        for(int i=1;i<=t;i++){
           a[i]=  Integer.parseInt(br.readLine());
        }
        new Thread(null,new Runnable(){
            public void run(){
                try{
                Quick(a, 1, t);
        for(int k=1;k<=t;k++){
         
            out.println(a[k]);
        }
        out.flush();
                }
                catch(StackOverflowError e){
                    System.out.println("RTE");
                }
            }
        },"1",1<<26).start();
        
    }
   static int Partition(int a[],int p,int r){
          int x=a[r];
          int i=p-1;
          int temp;
          for(int j=p;j<=r-1;j++){
             
              if(a[j]<x){
                  i=i+1;
                  temp=a[i];
                  a[i]=a[j];
                  a[j]=temp;
              
                }
          }
          temp=a[i+1];
          a[i+1]=a[r];
          a[r]=temp;
          
          return i+1;
    }
    
  static void Quick(int a[],int p, int r){
          if(p<r){
              int q=Partition(a, p, r);
              Quick(a, p, q-1);
              Quick(a, q+1,r );
          }
    }
}
