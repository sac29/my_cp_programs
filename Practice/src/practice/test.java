/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.Stack;

/**
 *
 * @author sachin
 */
public class test {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(3);
        st.push(4);
        st.push(5);
        for(int i=1;i<=4;i++){
            System.out.println(st.pop());
        }
    }
}
