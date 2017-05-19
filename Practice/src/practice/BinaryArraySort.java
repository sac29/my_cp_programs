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
public class BinaryArraySort {
    public static void Sort(int A[], int n)
    {
        // k stores index of next available position
        int k = 0;
     
        // do for each element
        for (int i = 0; i < n; i++)
        {
            // if current element is zero, put 0 at next free
            // position in the array
            if (A[i] == 0)
                A[k++] = 0;
        }
     
        // fill all remaining indexes by 1
        for (int i = k; i < n; i++)
            A[k++] = 1;
    }
 
    // main function
    public static void main (String[] args)
    {
        int A[] = { 0, 0, 1, 0, 1, 1, 0, 1, 0, 0 };
        int n = A.length;
 
        Sort(A, n);
 
        // print the rearranged array
        for (int i = 0 ; i < n; i++)
            System.out.print(A[i] + " ");
    }
}
