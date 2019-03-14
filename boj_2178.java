package kakao_test;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class boj_2178 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());	
		int m = Integer.parseInt(st.nextToken());	
		int[][] map=new int[n+1][m+1];	//0,0은 빼고 1,1부터 시작하기 위해 +1로 설
		String str;
		int count=1,currentCol=1,currentRow=1;
		
		for(int i=1; i<n+1; i++) {
			st = new StringTokenizer(br.readLine());
			str=st.nextToken();
			for(int j=1; j<m+1; j++) {
				map[i][j]= str.charAt(j-1)-48; 
			}
		}
		System.out.print("1");
		while(!(currentCol==n&&currentRow==m)) {		//n,m에 
			count++;
			if(currentRow!=m&&currentCol!=n) {
				if(map[currentCol][currentRow+1]==1) {
					currentRow++;
					System.out.print("2");
				}
				else if(map[currentCol+1][currentRow]==1) {
					currentCol++;
					System.out.print("3");
				}
			}
			else if(currentRow!=m) {
				if(map[currentCol][currentRow+1]==1) {
					currentRow++;
					System.out.print("4");
				}
				
			}
			else if(currentCol!=n){
				if(map[currentCol+1][currentRow]==1) {
					currentCol++;
					System.out.print("5");
				}
			}
		}
		
		bw.write(count);
		bw.flush();
		bw.close();
	}

}
