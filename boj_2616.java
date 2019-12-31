/**
* https://www.acmicpc.net/problem/2616
*/
import java.io.*;
import java.util.*;

public class Main {
	static int[] train, sum;
	static int[][] DP;
	static int max;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int answer = 0;
		train = new int[n + 1];
		sum = new int[n + 1];

		st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= n; i++) {
			train[i] = Integer.parseInt(st.nextToken());
			sum[i] = sum[i - 1] + train[i];
		}

		max = Integer.parseInt(br.readLine());
		DP = new int[4][n + 1];
 
		for (int i = 1; i < 4; i++) {
			for (int j = i * max; j <= n; j++) {
				DP[i][j] = Math.max(DP[i][j - 1], DP[i - 1][j - max] + (sum[j] - sum[j - max]));
			}
		}
		System.out.println(DP[3][n]);
	}
}
