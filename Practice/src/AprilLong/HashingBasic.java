/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package AprilLong;

import java.util.Hashtable;

/**
 *
 * @author Sachin
 */
public class HashingBasic {
    public static void main(String[] args) {
        Hashtable<Integer,Integer> hm=new Hashtable<>();
        for(int i=1;i<=10;i++){
            hm.put(i, i);
        }
        System.out.println(hm.contains(3));
    }
}
