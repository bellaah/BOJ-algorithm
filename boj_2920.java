import java.util.Scanner;
/*
https://www.acmicpc.net/problem/2920
*/
public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int[] scale=new int[8];
		for(int i=0; i<scale.length; i++) {
			scale[i]=in.nextInt();
		}
		boolean ascending=false,descending=false;
		for(int i=0; i<scale.length-2; i++) {
			if(scale[i]<scale[i+1]&&scale[i+1]<scale[i+2]) {
				ascending=true;
			}else if(scale[i]>scale[i+1]&&scale[i+1]>scale[i+2]) {
				descending=true;
			}else {
				ascending=false;
				descending=false;
				break;
			}
		}
		if(ascending) {
			System.out.print("ascending");
		}else if(descending) {
			System.out.print("descending");
		}else {
			System.out.print("mixed");
		}
	}
}
