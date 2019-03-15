import java.io.*;
import java.util.StringTokenizer;
/*
https://www.acmicpc.net/problem/1915
*/

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] dp = new int[n+1][m+1];
        int[][] list = new int[n+1][m+1];

        for ( int i=1; i<=n; i++ ) {
            String str = br.readLine();
            for ( int j=1; j<=m; j++ ) list[i][j] = Integer.parseInt(str.substring(j-1, j));
        }

        long answer = 0;

        for ( int i=1; i<=n; i++ ) {
            for ( int j=1; j<=m; j++ ) {
                if ( list[i][j] == 0 ) dp[i][j] = 0;
                else {
                    dp[i][j] = Math.min(dp[i-1][j], dp[i][j-1]);
                    dp[i][j] = Math.min(dp[i][j], dp[i-1][j-1]) + 1;
                    answer = Math.max(answer, dp[i][j]);
                }
            }
        }

        bw.write(answer*answer + "\n");
        bw.flush();
        bw.close();
    }
}
