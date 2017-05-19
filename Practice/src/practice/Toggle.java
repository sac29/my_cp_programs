/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Toggle {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        char a[]=s.toCharArray();
        for(int i=0;i<s.length();i++){
              if('A'<=a[i] && a[i]<='Z')
                 a[i]=(char)(((int)a[i])+32);
              else if('a'<=a[i] && a[i]<='z')
                  a[i]=(char)(((int)a[i])-32);
        }
        System.out.println(a);
    }
}
