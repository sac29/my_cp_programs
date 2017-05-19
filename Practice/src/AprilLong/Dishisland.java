/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AprilLong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Hashtable;
import java.util.Scanner;

/**
 *
 * @author sachin
 */
public class Dishisland {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        Scanner in = new Scanner(System.in);
        while (t-- > 0) {
            
            String temp[] = br.readLine().split(" ");
            int n = Integer.parseInt(temp[0]);
            int k = Integer.parseInt(temp[1]);
            int cnt[]=new int[k+1];
            int a[][] = new int[n + 1][k + 1];
            for (int i = 1; i <= n; i++) {
                int sum = 0;
                String tem[] = br.readLine().split(" ");
                for (int j = 0; j < tem.length; j++) {
                    a[i][j] = Integer.parseInt(tem[j]);
                    cnt[a[i][j]]+=1;
                    }
                
            }
            for(int l=1;l<=k;l++){
                if(cnt[l]==0){
                    System.out.println("sad");
                }
            }

        }
    }
  }
