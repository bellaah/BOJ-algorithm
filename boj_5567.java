https://www.acmicpc.net/problem/5567

import java.io.*;
import java.util.StringTokenizer;

public class Main{

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		int friend1, friend2, answer = 0;

		int[][] matrix = new int[n + 1][n + 1];
		boolean[] invite = new boolean[n + 1];

		for (int i = 0; i < m; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			friend1 = Integer.parseInt(st.nextToken());
			friend2 = Integer.parseInt(st.nextToken());
			matrix[friend1][friend2] = 1;
			matrix[friend2][friend1] = 1;
		}

		for (int i = 2; i < n + 1; i++) {
			if (matrix[1][i] == 1) {
				if (!invite[i]) {
					answer++;
					invite[i] = true;
				}
				for (int j = 2; j < n + 1; j++) {
					if (matrix[i][j] == 1 && !invite[j]) {
						answer++;
						invite[j] = true;
					}
				}
			}
		}
		System.out.print(answer);
	}
}
