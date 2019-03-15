import java.util.Scanner;
/*
https://www.acmicpc.net/problem/2438
*/
public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=i; j++) {
			System.out.print("*");
		}
			System.out.println();
	}
	}
}
