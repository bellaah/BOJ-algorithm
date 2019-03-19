import java.io.*;
import java.util.StringTokenizer;

public class Main{

	public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	       StringTokenizer st = new StringTokenizer(br.readLine());
	       int n= Integer.parseInt(st.nextToken());
	       int m=Integer.parseInt(st.nextToken());
	       int[] num=new int[n+1];
	       int[] dp=new int[n+1];
	       int start,end=0;
	       st = new StringTokenizer(br.readLine());
	       for(int i=1; i<=n; i++) {	//수를 입력받음 
	    	   num[i]=Integer.parseInt(st.nextToken());
	    	   dp[i]=dp[i-1]+num[i];
	       }
	       for(int i=0; i<m; i++) {
	    	   st = new StringTokenizer(br.readLine());
	    	   start=Integer.parseInt(st.nextToken());
	    	   end=Integer.parseInt(st.nextToken());
	    	   bw.write(dp[end]-dp[start-1]+"\n");
	       }
	       bw.flush();
	}

}
