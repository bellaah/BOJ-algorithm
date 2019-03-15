import java.util.Scanner;
/*
https://www.acmicpc.net/problem/2960
*/
public class Main {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N = sc.nextInt();
	int K = sc.nextInt();
	int count=0;
	boolean[] a=new boolean[N+1];
	for (int i=2; i<N+1; ++i)
    {
       if(!a[i]) {
    	   ++count;
    	   a[i]=true;
    	   if(count==K) {
    		   System.out.print(i);
    		   break;
    	   }
    	   else {
    		   for (int j=2; j*i<N+1; j++){
    			   if(!a[i*j]) {
    		    	   ++count;
    		    	   a[i*j]=true;
    		    	   if(count==K) {
    		    		   System.out.print(j*i);
    		    		   break;
    		    	   }
    		   }    
    		   }
    	   }
       }
	}
	}
}
