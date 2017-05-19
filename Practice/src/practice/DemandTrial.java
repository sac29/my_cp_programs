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
class DemandTrial {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());
        while (test-- > 0) {
            String tem[] = br.readLine().split(" ");
            int n = Integer.parseInt(tem[0]);
            int t = Integer.parseInt(tem[1]);
            String no[] = br.readLine().split(" ");
            int dig[] = new int[n];
            for (int i = 0; i < n; i++) {
                dig[i] = Integer.parseInt(no[i]);
            }
            for (int j = 1; j <= t; j++) {
                int arr[] = new int[n];

                for (int i = 0; i < n; i++) {
                    if (i == 0) {
                        if (dig[i + 1] == 0) {
                            arr[i] = 0;
                        } else if (dig[i + 1] == 1) {
                            arr[i] = 1;
                        }
                    } else if (i == n - 1) {
                        if (dig[i - 1] == 0) {
                            arr[i] = 0;
                        } else if (dig[i - 1] == 1) {
                            arr[i] = 1;
                        }
                    } else {
                        if (dig[i - 1] == 1 && dig[i + 1] == 1) {
                            arr[i] = 1;
                        } else {
                            arr[i] = 0;
                        }
                    }
                }
                dig = arr;

            }
             
          String st=strJoin(dig, " ");
            System.out.println(st);
    
    }
}
    public static String strJoin(int[] aArr, String sSep) {
        StringBuilder sbStr = new StringBuilder();
        for (int i = 0, il = aArr.length; i < il; i++) {
            if (i > 0) {
                sbStr.append(sSep);
            }
            sbStr.append(aArr[i]);
        }
        return sbStr.toString();
}
}
