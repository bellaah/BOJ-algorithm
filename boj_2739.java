import java.util.Scanner;
/*
https://www.acmicpc.net/problem/2739
*/
public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		for(int i=1; i<=9; i++) {
			System.out.println(num+" * "+i+" = "+(num*i));
		}
	}
}
