import java.util.Scanner;
/*
https://www.acmicpc.net/problem/1193
*/
public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		int tmp=0,divisor=0,dividend=0;
		for(int i=1; i<10000; i++) {
			if(num>tmp && tmp+i>=num) {
				if(i%2==0) {
					divisor=i+1-(num-tmp);
					dividend=(num-tmp);	
				}
				else {
					divisor=(num-tmp);
					dividend=i+1-(num-tmp);
				}
				break;
			}
			tmp+=i;
		}
		System.out.print(dividend+"/"+divisor);
	} 
} 
