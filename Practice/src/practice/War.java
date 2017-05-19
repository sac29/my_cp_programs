/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practice;

import java.util.Scanner;
import jdk.nashorn.internal.parser.TokenType;

/**
 *
 * @author Sachin
 */
public class War {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
          for(int i=1;i<=t;i++){
              int n=sc.nextInt();
              int bob[]=new int[n+1];
              int bo=Integer.MIN_VALUE,al=Integer.MIN_VALUE;
              int alice[]=new int[n+1];
               for(int l=0;l<n;l++){
                   bob[l]=sc.nextInt();
                   if(bo<bob[l])bo=bob[l];
               }
                for(int l=0;l<n;l++){
                    alice[l]=sc.nextInt();
                    if(al<alice[l])al=alice[l];
                }
                
                if(bo==al)
                    System.out.println("Tie");
                else if(bo>al)
                    System.out.println("Bob");
                else
                    System.out.println("Alice");
          }
        
    }
}
