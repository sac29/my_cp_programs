

package practice;

import com.sun.jmx.snmp.BerDecoder;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.*;
/**
 *
 * @author Sachin
 */
public class Practice {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a[]=new int[200];
      
        Integer t = Integer.parseInt(br.readLine());
         for(int i=1;i<=t;i++){
             Integer n=Integer.parseInt(br.readLine());
                int m=0;
              int num=n;
              while(num>0){
                  a[m++]=num%10;
                  num/=10;
                  
              }
             while(n>1){
                 int j=0;
                 int temp=0;
                   while(m>0){
                          int x=a[j]*(n-1)+temp;
                          a[j]=x%10;
                         temp=x/10;
                         m--;
                         i++;
                      }
                   while(temp>0){
                       a[j++]=temp%10;
                       temp/=10;
                   }
                 m=j;
                 n--;
             }
             for(i=m-1;i>=0;i--){
                 System.out.println(a[i]);
             }
         }
         
    }
    static void  BigFactorial(int n){
        BigInteger fact[]=new BigInteger[n+1];
        fact[0]=BigInteger.ONE;
        for(int i=1;i<=n;i++){
            fact[i]=fact[i-1].multiply(BigInteger.valueOf(i));
        }
    }
    
}
