import java.util.Scanner;
/*
https://www.acmicpc.net/problem/1256
*/
public class Main{

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int N=in.nextInt();
		int M=in.nextInt();
		int K=in.nextInt();
		int[][] dp=new int[N+M+1][N+M+1];
		String str="";
		int count=N+M;
		for(int i=0; i<=N+M; i++) {
			dp[i][0]=1;
			for(int j=1; j<=i; j++) {
				dp[i][j]=dp[i-1][j]+dp[i-1][j-1];
				if ( dp[i][j] > 1000000000 ) dp[i][j] = 1000000001;

			}
		}
		if (K>dp[N+M][M]) {
			System.out.println(-1);
		}
		else {
			for(int i=0; i<count; i++) {
				if ( K <= dp[N+M-1][M] ) {       
                    str+="a";
                    N--;
                } else {                                   
                	str+="z";
                    K -= dp[N+M-1][M];            
                    M--;
                }

			}
		}
		System.out.print(str);
	}
}
