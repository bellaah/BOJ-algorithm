import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int testNum=in.nextInt();
		for(int i=0; i<testNum; i++) {
			int H=in.nextInt();
			int W=in.nextInt();
			int N=in.nextInt();
			int floor=N%H,household=N/H+1;
			if(N%H==0) {
				household=N/H;
				floor=H;
			}
			System.out.println(floor*100+household);
		}
	}
}
