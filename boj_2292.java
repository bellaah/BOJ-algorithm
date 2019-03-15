import java.util.Scanner;
/*
https://www.acmicpc.net/problem/2292
*/
public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		int room=1;
		int tmp=1;
		for(int i=1; i<100000; i++) {
			if(tmp<num && (tmp+=6*i)>=num) {
				room +=i;
				break;
			}
		}
		System.out.print(room);
	}
}
