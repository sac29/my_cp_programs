/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author sachin
 */
class FredoLarge {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String tem[] = br.readLine().split(" ");
        long num[] = new long[n + 1];
        for(int i=0;i<n;i++)
            num[i]=Long.parseLong(tem[i]);
        
        int q=Integer.parseInt(br.readLine());
        ArrayList<Integer> al=new ArrayList<>();
        
    }
}
