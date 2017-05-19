
package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Instant;
import java.util.Scanner;

public class Racing {
    public static void main(String[] args) throws IOException {
         Scanner sc=new Scanner(System.in);
         int t=sc.nextInt();
         for(int i=1;i<=t;i++){
             int n=sc.nextInt();
             int s[]=new int[n+1];
             for(int l=0;l<n;l++)s[l]=sc.nextInt();
             int min=Integer.MAX_VALUE;
              for(int j=0;j<s.length-1;j++){
                 for(int k=j+1;k<s.length-1;k++){
                       int a=(s[k])-(s[j]);
                       if(a<0)a=a*-1;
                      if(a<min){
                          min=a;
                      }
                 } 
              }
             System.out.println(min);
         }
    }
}
