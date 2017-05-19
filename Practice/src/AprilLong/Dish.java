
package AprilLong;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author sachin
 */
public class Dish {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            String dish1[]=br.readLine().split(" ");
            String dish2[]=br.readLine().split(" ");
            int count=0;
            for(int i=0;i<dish1.length;i++){
                for(int j=0;j<dish2.length;j++){
                    if(dish1[i].equals(dish2[j]))
                      count++;
                    
                }
            }
            if(count>=2)
                System.out.println("similar");
            else
                System.out.println("dissimilar");
        }
    }
}
