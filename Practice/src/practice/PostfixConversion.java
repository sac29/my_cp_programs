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
 * @author sachin
 */
public class PostfixConversion {
        static final int MAX=1000;
        int top=-1;
        char stack[]=new char[MAX];
        boolean isEmpty(){
            return (top==-1)?true:false;
        }

     
     void push(char a){
         if(top>=MAX){
             System.out.println("Stack overflow");
             
         }
         else{
             stack[++top]=a;
            
         }
     }
     
     char pop(){
            
            return stack[top--];
         
     }
     char peek(){
         return stack[top];
     }
        
        
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PostfixConversion t=new PostfixConversion();
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            String exp = br.readLine();
            char expr[] = exp.toCharArray();
            
            for (int i = 0; i < expr.length - 1; i++) {
                switch(expr[i]){
                    case '(':break;
                    case ')':System.out.println(t.pop());
                    break;
                    case '+':
                    case '-':
                    case '/':
                    case '*':
                    case '^':
                        t.push(expr[i]);
                        break;
                    default:System.out.println(t.pop());
                }
                   
             

        }
    }
    
}
}
