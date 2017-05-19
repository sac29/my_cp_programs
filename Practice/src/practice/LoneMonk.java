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
public class LoneMonk {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n+1];
        for(int i=0;i<n;i++)a[i]=sc.nextInt();
        int presum[]=new int[n+1];
        presum[0]=a[0];
        for(int i=1;i<n;i++){
            presum[i]=presum[i-1]+a[i];
        }
       
        
        int countodd=0;
        int counteven=1;
        for(int i=1;i<n;i++){
           
            if(presum[i]%2==1)
                countodd++;
            else
                counteven++;
        }
        System.out.println(counteven+countodd);
    }
}
