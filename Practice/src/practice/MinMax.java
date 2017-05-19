/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practice;


import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Sachin
 */
public class MinMax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n+1];
        for(int i=0;i<n;i++)a[i]=sc.nextInt();
        Arrays.sort(a);
        int flag=0;
        
        for(int i=2;i<n;i++){
            if(a[1]==a[n-1]){
                flag=1;
                break;
            } 
            if(a[i]==a[i-1])continue;
             if(a[i]==a[i-1]+1)
             {}
             else
                 flag=1;
        }
        if(flag==0)System.out.println("YES");
        else System.out.println("NO");
    }
}
