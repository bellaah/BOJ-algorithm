import java.io.*;
import java.util.StringTokenizer;
/*
https://www.acmicpc.net/problem/2579
*/
public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
       StringTokenizer st = new StringTokenizer(br.readLine());
       int n= Integer.parseInt(st.nextToken());
       int[] data=new int[n];
       int[] dp=new int[n];
       for(int i=0; i<n; i++) {
	       st = new StringTokenizer(br.readLine());
	       data[i]=Integer.parseInt(st.nextToken());
       }
       dp[0]=data[0];
       dp[1]=data[0]+data[1];
       if(data[0]>data[1]) {
    	   dp[2]=data[0]+data[2];
       }
       else {
    	   dp[2]=data[1]+data[2];
       }
       for(int i=3; i<n; i++) {
    	   if(dp[i-2]>dp[i-3]+data[i-1]) {
    		   dp[i]=dp[i-2]+data[i];
    	   }
    	   else {
    		   dp[i]=dp[i-3]+data[i-1]+data[i];
    	   }
       }
    	   bw.write(dp[n-1]+"\n");
    	   bw.flush();
	}
}
