import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;
/*
https://www.acmicpc.net/problem/7579
*/

public class Main{

	public static void main(String[] args) throws IOException {
		Scanner in=new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st = new StringTokenizer(br.readLine());
       int n= Integer.parseInt(st.nextToken());
       int m= Integer.parseInt(st.nextToken());	//필요한 메모리
       int[] appByte=new int[n+1];
       int[] cost=new int[n+1];
       int[][] dp;
       int csum=0;
       
       st = new StringTokenizer(br.readLine());
       for(int i=1; i<n+1; i++) {
    	   appByte[i]=Integer.parseInt(st.nextToken());
       }
       
       st = new StringTokenizer(br.readLine());
       for(int i=1; i<n+1; i++) {
    	   cost[i]=Integer.parseInt(st.nextToken());
    	   csum+=cost[i];
       }
       dp=new int[n+1][csum+1];
       int max=10000001;
       for(int i=1; i<n+1; i++) {
    	   for(int j=0; j<=csum; j++) {
    		   if(j<cost[i]) {
    			   dp[i][j]= dp[i-1][j];
    		   }
    		   else {
    			   dp[i][j]=Math.max(dp[i-1][j],dp[i-1][j-cost[i]]+appByte[i]);
    		   }
    		   
    		   if(dp[i][j]>=m&&j<max) {
    			   max=j;
    		   }
    	   }
       }
       System.out.print(max);
	}
}
