/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Palindrome {
    public static void main(String[] args) throws IOException {
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         String a=br.readLine();
         
         char str[]=a.toCharArray();
         
         int flag=0;
         for(int i=0;i<=a.length()-1;i++){
             if(str[i]!=str[str.length-i-1]){
                 flag=1;
                 break;}
         }
         if(flag==1)
             System.out.println("NO");
         else
             System.out.println("YES");
    }
}
