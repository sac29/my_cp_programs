package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Kadane {

    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int arr[] = new int[n];
            String a[] = br.readLine().split(" ");

            for(int i=0; i < n; i++) {
                arr[i] = Integer.parseInt(a[i]);
            }
            int maxSoFar = arr[0];
            int maxEnd = 0;
            for(int i=0;i<n;i++) {
                maxEnd = maxEnd + arr[i];
                if (maxSoFar < maxEnd) {
                    maxSoFar = maxEnd;
                }

                if (maxEnd < 0) {
                    maxEnd = 0;
                }
            }

            System.out.println(maxSoFar);
        }
    }
}
