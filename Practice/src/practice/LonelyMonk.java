/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practice;

import java.util.Scanner;

/**
 *
 * @author Sachin
 */
public class LonelyMonk {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n+1];
        for(int i=0;i<n;i++)a[i]=sc.nextInt();
        int cur,count=0;
        for(int i=0;i<n;i++){
             cur=a[i];
             for(int j=i+1;j<=n;j++){
                 if(cur%2==0)
                     count++;
                 cur=cur+a[j];
             }
        }
        System.out.println(count);
    }
}
