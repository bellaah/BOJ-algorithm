import java.util.Scanner;
/*
https://www.acmicpc.net/problem/2908
*/
public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int tmp=in.nextInt();
		int num1=(tmp%10)*100+((tmp/10)%10*10)+tmp/100;
		tmp=in.nextInt();
		int num2=(tmp%10)*100+((tmp/10)%10*10)+tmp/100;
		int large=num1;
		if(num1<num2) {
			large=num2;
		}
		System.out.print(large);
	}
}
