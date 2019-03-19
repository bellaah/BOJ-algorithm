import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		String str=in.next();
		int sum=0;
		for(int i=0; i<num; i++) {
			sum+=(int)str.charAt(i)-48;
		}
		System.out.print(sum);
	}
}
