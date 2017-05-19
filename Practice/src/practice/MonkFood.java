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
class MonkFood {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int q = Integer.parseInt(br.readLine());
        int que[] = new int[q + 1];
        int cost[] = new int[q + 1];
        int top = -1;
        for (int i = 0; i < q; i++) {
            String tem[] = br.readLine().split(" ");
           
            if (tem.length == 1) {
                que[i] = Integer.parseInt(tem[0]);
                if (que[i] == 1 && top == -1) {
                    System.out.println("No Food");
                } else if (que[i] == 1 && top != -1) {
                    System.out.println(cost[top--]);
                }
            }
            else{
                 top++;
                 cost[top]=Integer.parseInt(tem[1]);
            }
        }
    }
}
