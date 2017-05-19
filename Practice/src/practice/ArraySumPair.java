/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
/**
 *
 * @author sachin
 */
public class ArraySumPair {
     public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int sum=Integer.parseInt(br.readLine());
        String tem[]=br.readLine().split(" ");
        int arr[]=new int[n+1];
        for(int i=0;i<tem.length;i++){
            arr[i]=Integer.parseInt(tem[i]);
        }
        Arrays.sort(arr);
        int low=0;
        int high=tem.length-1;
        while(low<high){
            if(arr[low]+arr[high]==sum){
                System.out.println("sum found");
                break;
            }
            else if(arr[low]+arr[high]<sum)
                low++;
            else
                high--;
            
        }
        
    }
}
