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
public class Bombs {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st=br.readLine();
        char s[]=st.toCharArray();
        int count=0;
        for(int i=0;i<s.length-2;i++){
              if(s[i]=='B'&& s[i+1]=='W'&&s[i+2]=='W'){
                  count++;
              }
         
                  
        }
    }
     
    
}
