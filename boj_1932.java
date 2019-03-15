import java.io.*;
import java.util.*;
/*
https://www.acmicpc.net/problem/1932
*/
public class Main{
	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	       StringTokenizer st = new StringTokenizer(br.readLine());
	       int n= Integer.parseInt(st.nextToken());
	        int[][] dp=new int[n][n];
	        int max=0;
	        st = new StringTokenizer(br.readLine());
	        dp[0][0]= Integer.parseInt(st.nextToken());
	        for(int i=1; i<n; i++) {
	        	st = new StringTokenizer(br.readLine());
	        	for(int j=0; j<=i; j++) {
	        		dp[i][j]= Integer.parseInt(st.nextToken());
	        		if(j==0) {
	        			dp[i][j]+=dp[i-1][j];
	        		}
	        		else if(j==i) {
	        			dp[i][j]+=dp[i-1][j-1];  
	        		}
	        		else {
	        			if(dp[i-1][j-1]>dp[i-1][j]) {
	        				dp[i][j]+=dp[i-1][j-1];
	        			}
	        			else {
	        				dp[i][j]+=dp[i-1][j];
	        			}
	        		}
	        	}
	        }
	        for(int i=0; i<n; i++) {
	        	if(max<dp[n-1][i]) {
	        		max=dp[n-1][i];
	        	} 
	        }
	        System.out.print(max);
	}
}
