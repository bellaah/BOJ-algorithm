import java.io.*;
import java.util.*;

public class Main {
	static int[][] map = new int[26][26];
	private static int[] addRow = { -1, 0, 1, 0 };
	private static int[] addCol = { 0, 1, 0, -1 };
	static int n;
	static int count = 2;
	static LinkedList<Integer> scale = new LinkedList<>();
	static Queue<String> q = new LinkedList<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String input;

		n = Integer.parseInt(br.readLine());

		for (int i = 1; i <= n; i++) {
			input = br.readLine();
			for (int j = 0; j < n; j++) {
				map[i][j + 1] = input.charAt(j) - '0';
			}
		}

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (map[i][j] == 1) {
					scale.add(1);
					map[i][j] = count;
					q.add(i + ";" + j);
					bfs();
					count++;
				}
			}
		}
		scale.sort(null);
		System.out.println(scale.size());
		for (int i = 0; i < scale.size(); i++) {
			System.out.println(scale.get(i));
		}
	}

	public static void bfs() {
		while (!q.isEmpty()) {
			String tmp = q.poll();
			int row = Integer.parseInt(tmp.split(";")[0]);
			int col = Integer.parseInt(tmp.split(";")[1]);
			for (int i = 0; i < 4; i++) {
				int row1 = row + addRow[i];
				int col1 = col + addCol[i];
				if (row1 < 0 || row1 > n || col1 < 0 || col1 > n) {
					continue;
				}
				if (map[row1][col1] == 1) {
					map[row1][col1] = count;
					q.add(row1 + ";" + col1);
					scale.set(scale.size() - 1, scale.get(scale.size() - 1) + 1);
				}
			}
		}
	}

}
