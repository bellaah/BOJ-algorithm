import java.util.ArrayList;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int n=in.nextInt();
		int[] isprime= new int[n+1];	//1이면 소수
		ArrayList<Integer> prime=new ArrayList<>();
		int tmp=0;
		for (int i=2; i<n+1; i++)	//소수 미리구해놓기 
	    {
	       if(isprime[i]==0) {
	    	   isprime[i]=1;
	    	   prime.add(i);
	    	   for (int j=2; j<n/i; j++){
	    			if(isprime[i*j]==0) {
	    				isprime[i*j]=2;
	    		   }    
	    	   }
	       }
		}
		for(int i = 0 ; i<prime.size()&& prime.get(i)<=n; i++)
        {
            while(n%prime.get(i) == 0)
            {
                System.out.println(prime.get(i));
                n= n/prime.get(i);
            }
        }
	}

}
