/**
 * https://www.acmicpc.net/problem/2869
 */
import java.io.*;
import java.util.*;

public class boj_2869_1117 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		int answer = 1, subValue = A - B; // 마지막 한번을 포함
		V -= A;
		int share = V / subValue;

		if (V - (subValue * share) <= 0) {
			answer += share;
		} else {
			answer += share + 1;
		}

		System.out.println(answer);

	}

}
