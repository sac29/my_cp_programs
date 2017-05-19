package practice;

    import java.util.*;
    class Testing
    {
    	public static void main(String args[])
    	{
    		Scanner in=new Scanner(System.in);
    		int t=in.nextInt();
    		while(t-->0)
    		{	
    			int m=in.nextInt();
    			int n=in.nextInt();
    			calc(m,n);
    		}
    	}
    			
    			public static void calc(int m,int n){
    			if(m==1 || m%2==0)
    			{if(m==2)
    				{System.out.println(2);
    				m=3;}
    				else if(m==1 && n>1)
    				{System.out.println(2);
    				m=3;}
    				else
    					m++;
    			}	
    			for(int i=m;i<=n;i+=2)
    			{	boolean prime=true;
    				if(i%2==0)
    					prime=false;
    				else{
    				for(int j=3;j<=Math.sqrt(i);j+=2){
    				
    					if(i%j==0)
    					{	prime=false;
    						break;
    				}}}
    					if(prime)
    			System.out.println(i);	
    				
    			}		
    		System.out.println();
    		}	
    } 