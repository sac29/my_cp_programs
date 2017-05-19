package practice;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 class Presidential {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int a[] = new int[20005];
        int presum[] = new int[20005];
        while (t-- > 0) {
            String temp[] = br.readLine().split(" ");
            int n = Integer.parseInt(temp[0]);
            int q = Integer.parseInt(temp[1]);
            String s = br.readLine();
            char c[] = s.toCharArray();
            for(int i=0;i<n+2;i++){
                a[i]=0;
                presum[i]=0;
            }
            for (int i = 1; i <= q; i++) {
                String tem[] = br.readLine().split(" ");
                int l = Integer.parseInt(tem[0]);
                int r = Integer.parseInt(tem[1]);
                a[l - 1]++;
                a[r ]--;
            }
            //for(int j=0;j<n+1;j++)System.out.print(a[j]);
            
            presum[0] = a[0];
            for (int i = 1; i < n+1; i++) {
                presum[i] = presum[i - 1] + a[i];
               
            }
            for (int j = 0; j <c.length ; j++) {
                c[j] = (char) ('a' + (((c[j] - 'a' - (presum[j])%26) + 26) % 26));
            }
            
            System.out.println((new String(c)).substring(0,c.length-1));
        }
    }
}
