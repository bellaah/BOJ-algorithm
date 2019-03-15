import java.io.*;
import java.util.StringTokenizer;
/*
https://www.acmicpc.net/problem/2166
*/
public class Main{
	static double[][] xy;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
	    int n= Integer.parseInt(st.nextToken());
	    xy=new double[n][2];
	    double sum=0;
	    double tmp;
	    
		for(int i=0; i<n; i++) {
			 st = new StringTokenizer(br.readLine());
			 for(int j=0; j<2; j++){
				 xy[i][j]=Integer.parseInt(st.nextToken());
			 }	 
		 }
		for(int i=0; i<n; i++) {
			if(i==0)	sum+=(xy[i][0]+xy[n-1][0])*(xy[i][1]-xy[n-1][1]);
			else 	sum+=(xy[i][0]+xy[i-1][0])*(xy[i][1]-xy[i-1][1]);
		}
		if(sum<0) sum = -sum;
		System.out.printf("%.1f",sum/2.0);
	}
}
