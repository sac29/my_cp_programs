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
public class Life {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        for(;;){
            int n=sc.nextInt();
            if(n==42)
                break;
            else
                System.out.println(n);
        }
    }
}
