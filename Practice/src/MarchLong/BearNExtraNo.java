/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MarchLong;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Sachin
 */
public class BearNExtraNo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long a[] = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            long c = 0;
            if(a[1]!=a[0]+1){
                c=a[0];
            }
            else if(a[n-1]!=a[n-2]+1){
                c=a[n-1];
            }
            else{
            for (int j = 1; j < n-1; j++) {
                if (a[j] == a[j - 1]) {
                    c=a[j];
                    break;
                }
                

            }
            
            }
            System.out.println(c);
        }
    }
}
