/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.Scanner;
import javax.sound.midi.SysexMessage;
import jdk.nashorn.internal.parser.Lexer;

/**
 *
 * @author sachin
 */
class Reward {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int ans=0;
        if(a*10>100)
            ans=ans+100;
        else
            ans=ans+a*10;
        if(b*10>100)
            ans=ans+100;
        else
            ans=ans+b*10;
        if(c*10>100)
            ans=ans+100;
        else
            ans=ans+c*10;
        System.out.println(ans);
    }

}
