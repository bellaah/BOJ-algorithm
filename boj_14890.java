import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int N=in.nextInt();
		int L=in.nextInt();
		int[][] map= new int[N][N];
		boolean[][] ramp=new boolean[N][N];
		int way=0;
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				map[i][j]=in.nextInt();
			}
		}
		
		for(int i=0; i<N; i++) {
			boolean pass=true;
			int sameNum=1;
			for(int j=0; j<N-1; j++) {
				if(map[i][j+1]-map[i][j]==1) {
					if(sameNum>=L){
						for(int k=0; k<L; k++) {
							if(!ramp[i][j-k]) {
								ramp[i][j-k]=true;
							}
							else {
								pass=false;
							}
						}
					}
					else {
						pass=false;
					}
					sameNum=1;
				}
				else if(map[i][j+1]-map[i][j]==-1) {
					if(j+L<N){
						for(int k=1; k<=L; k++) {
							if(map[i][j+k]-map[i][j]==-1&&!ramp[i][j+k]) {
								ramp[i][j+k]=true;
							}
							else {
								pass=false;
							}
							
						}
					}
					else {
						pass=false;
					}
					sameNum=1;
				}
				else if(map[i][j]-map[i][j+1]==0) {	
					sameNum++;
				}
				else {
					pass=false;
					break;
				}
				
			}
			if(pass) {
				way++;
			}
		}
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				ramp[i][j]=false;
			}
		}
		
		for(int j=0; j<N; j++) {
			boolean pass=true;
			int sameNum=1;
			for(int i=0; i<N-1; i++) {
				if(map[i+1][j]-map[i][j]==1) {	
					if(sameNum>=L){
						for(int k=0; k<L; k++) {
							if(!ramp[i-k][j]) {
								ramp[i-k][j]=true;
							}
							else {
								pass=false;
							}
						}
					}
					else {
						pass=false;
					}
					sameNum=1;
				}
				else if(map[i+1][j]-map[i][j]==-1) {
					if(i+L<N){
						for(int k=1; k<=L; k++) {
							if(map[i+k][j]-map[i][j]==-1&&!ramp[i+k][j]) {
								ramp[i+k][j]=true;
							}
							else {
								pass=false;
							}
						}
					}
					else {
						pass=false;
					}
					sameNum=1;
				}
				else if(map[i][j]-map[i+1][j]==0) {
					sameNum++;
				}
				else {
					pass=false;
					break;
				}
			}
			if(pass) {
				way++;
			}
		}
		System.out.println(way);
	}
}
