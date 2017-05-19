/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 *
 * @author Sachin
 */
class TheFootbalMatch {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            Stack<Integer> st = new Stack<>();
            String tem[] = br.readLine().split(" ");
            int n = Integer.parseInt(tem[0]);
            int id = Integer.parseInt(tem[1]);
            int curr=id;
            int prev = 0;
            for (int i = 1; i <= n; i++) {
               String tm[] = br.readLine().split(" ");
               int a=0;
                if (tm.length == 2) {
                    a = Integer.parseInt(tm[1]);
                    prev=curr;
                    curr=a;
                   
                } 
                
                
                else {
                    
                    int temp=curr;
                    curr=prev;
                    prev=temp;
                     
                }
                
            }

            System.out.println("Player " + curr);
        }
    }
}
