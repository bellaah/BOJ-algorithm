import java.io.*;
import java.util.StringTokenizer;

public class Main {
	static int[][] xy;
	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 xy=new int[3][2];
		 StringTokenizer st;
		 for(int i=0; i<3; i++) {
			 st = new StringTokenizer(br.readLine());
			 for(int j=0; j<2; j++){
				 xy[i][j]=Integer.parseInt(st.nextToken());
			 }	 
		 }
		 System.out.print(ccw());
	}
	public static int ccw() {
		int tmp=xy[0][0]*xy[1][1]+xy[1][0]*xy[2][1]+xy[2][0]*xy[0][1];
		tmp=tmp-(xy[0][1]*xy[1][0]+xy[1][1]*xy[2][0]+xy[2][1]*xy[0][0]);
		if(tmp==0)	return 0;
		else if(tmp>0) return 1;
		else return -1;
    }
}
