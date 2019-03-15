import java.util.Scanner;
/*
https://www.acmicpc.net/problem/2748
*/
public class Main {
	public static void main(String[] args) {
			Scanner in=new Scanner(System.in);
			int N=in.nextInt();
			long[] D=new long[N+1];
			if(N>=1) {
				D[0]=0;
				D[1]=1;
			}
			for(int i=2; i<=N; i++) {
				D[i]=D[i-1]+D[i-2];
			}
			System.out.print(D[N]);
	}
}
