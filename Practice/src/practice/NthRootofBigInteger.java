/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.ArrayList;

/**
 *
 * @author Sachin
 */
 class NthRootofBigInteger {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String ar[] = br.readLine().split(" ");
        long arr[] = new long[n + 2];
        for (int i = 0; i < n; i++) {
            arr[i] = Long.parseLong(ar[i]);
            // System.out.println(arr[i]);
        }
        BigInteger f = new BigInteger("1");
        for (int j = 0; j < n; j++) {
            f = f.multiply(BigInteger.valueOf(arr[j]));
        }
        BigDecimal result;
    	result = NthRoot(f,n);
        BigDecimal floored = result.setScale(0, RoundingMode.FLOOR);
        BigDecimal resultf = floored.add(new BigDecimal(1));
        System.out.println(resultf);
    }
     
    public static BigDecimal NthRoot(BigInteger num,int n)
    {
        ArrayList<BigDecimal> arr = new ArrayList<BigDecimal>();
       	Integer i = 1;
		Integer j = 0;
        BigDecimal[] tArray = new BigDecimal[5];
        BigDecimal N = new BigDecimal(n);
        BigDecimal A = new BigDecimal(num);
        arr.add(0,A);

        while(true)
        {
		    tArray[0] = (arr.get(i-1).multiply(new BigDecimal(n-1)));
		    tArray[1] = ((arr.get(i-1)).pow(n-1));
		    tArray[2] = A.divide(tArray[1],6,RoundingMode.FLOOR);
		    tArray[3] = tArray[0].add(tArray[2]);
		    tArray[4] = tArray[3].divide(N,6,RoundingMode.FLOOR);

		    arr.add(i,tArray[4]);
	        i = i + 1;

	        if ((arr.get(i-1)).compareTo(arr.get(i-2)) == 0)
		    {
		        break;
	        }
       }

        return arr.get(i-1);
    }
    
}
