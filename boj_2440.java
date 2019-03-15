import java.util.Scanner;
/*
https://www.acmicpc.net/problem/2440
*/
public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		for(int i=0; i<num; i++) {
			for(int j=num-i; j>0; j--) {
			System.out.print("*");
		}
			System.out.println();
	}
	}
}
