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
public class Destination {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String line=br.readLine();
       char s[]=line.toCharArray();
       int x=0,y=0;
       for(int i=0;i<s.length;i++){
            if(s[i]=='L')x=x-1;
            else if(s[i]=='R')x=x+1;
            else if(s[i]=='U')y=y+1;
            else if(s[i]=='D')y=y-1;
       }
        System.out.println(x+" "+y);
    }
}
