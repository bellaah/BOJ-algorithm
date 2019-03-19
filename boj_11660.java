import java.io.*;
import java.util.StringTokenizer;

public class Main{

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
       StringTokenizer st = new StringTokenizer(br.readLine());
       int n= Integer.parseInt(st.nextToken());
       int m=Integer.parseInt(st.nextToken());
       int[][] data=new int[n+1][n+1];
       int[][] dp=new int[n+1][n+1];
       int startX,endX,startY,endY,sum=0;
       for(int i=1; i<n+1; i++) {
	       st = new StringTokenizer(br.readLine());
	       for(int j=1; j<=n; j++) {	//수를 입력받음 
	    	   data[i][j]=Integer.parseInt(st.nextToken());
	    	   dp[i][j]=dp[i][j-1]+data[i][j];
	       }
       }
       for(int i=0; i<m; i++) {
    	   sum=0;
    	   st = new StringTokenizer(br.readLine());
    	   startX=Integer.parseInt(st.nextToken());
    	   startY=Integer.parseInt(st.nextToken());
    	   endX=Integer.parseInt(st.nextToken());
    	   endY=Integer.parseInt(st.nextToken());
    	   for(int j=startX; j<=endX; j++) {
    		  sum+=dp[j][endY]-dp[j][startY-1];
    	   }
    	   bw.write(sum+"\n");
       }
       bw.flush();
}
}
