import java.util.Scanner;
/*
https://www.acmicpc.net/problem/1546
*/
public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		int[] data=new int[num];
		double max=0,sum=0;
		for(int i=0; i<num; i++) {
			data[i]=in.nextInt();
			if(data[i]>max) {
				max=data[i];
			}
		}
		for(int i=0; i<num; i++) {
			sum += data[i]/max*100;
		}
		System.out.print(sum/num);
}
}
