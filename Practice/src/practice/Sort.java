/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

/**
 *
 * @author Sachin
 */
 class Sort {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
         PrintWriter out=new PrintWriter(System.out);
        int a[]=new int[t]; 
        for(int i=0;i<t;i++){
            a[i]=Integer.parseInt(br.readLine());
        }
        Arrays.sort(a);
        for(int i:a)
            out.println(i);
        out.flush();
        out.close();
    }
 }
