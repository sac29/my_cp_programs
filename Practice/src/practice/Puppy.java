

package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 *
 * @author Sachin
 */
public class Puppy {
     public static void main(String[] args) throws IOException {
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        Integer t = Integer.parseInt(br.readLine());
        
            for (int i = 1; i <= t; i++) {
                String tmp[]=br.readLine().split(" ");
                int n=Integer.parseInt(tmp[0]);
                int k=Integer.parseInt(tmp[1]);
                int max =0;
              
                for (int j = 1; j <= k; j++) {
                  if((n%j)>max){
                      max=n%j;
                  }
                }
                System.out.println(max);
            }
        
 
    }
}
