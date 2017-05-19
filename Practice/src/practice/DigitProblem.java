
package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DigitProblem {
    public static void main(String[] args) throws IOException {
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         String a[]=br.readLine().split(" ");
         int x=Integer.parseInt(a[0]);
         int k=Integer.parseInt(a[1]);
         int num;
          num=x-k;
          if(num%10==9){
              System.out.println(num-1);
          }
          else
              System.out.println(num+1);
        
    }
}
