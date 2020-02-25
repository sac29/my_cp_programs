package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SubarrayWithGivenSum {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String in[] = br.readLine().split(" ");
            int n =  Integer.parseInt(in[0]);
            long gsum = Integer.parseInt(in[1]);
            long arr[] = new long[n];
            String a[] = br.readLine().split(" ");
            for(int i=0; i < n; i++) {
                arr[i] = Long.parseLong(a[i]);
            }
            long wsum = 0;
            int header = 0, flag = 0;
            for(int i=0; i<n ; i++) {
                wsum = wsum + arr[i];
                while (wsum > gsum) {
                    wsum = wsum - arr[header];
                    header++;
                }

                if (gsum == wsum) {
                    flag = 1;
                    System.out.println((header+1)+" "+(i+1));
                    break;
                }
            }

            if (flag == 0) {
                System.out.println(-1);
            }

        }
    }
}
