import java.util.Scanner;
/*
https://www.acmicpc.net/problem/2675
*/
public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		String[] str=new String[num+1];
		for(int i=0; i<=num; i++) {
			str[i]=in.nextLine();
		}
		for(int i=1; i<=num; i++) {
			for(int k=2; k<str[i].length(); k++) {
				for(int j=0; j<(int)str[i].charAt(0)-48; j++) {
					System.out.print(str[i].charAt(k));
				}
			}
			System.out.println();
		}
	}
}
