import java.util.Scanner;
/*
https://www.acmicpc.net/problem/1924
*/
public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int month=in.nextInt();
		int day=in.nextInt();
		int wholeday=0;
		String[] week= {"SUN","MON","TUE","WED","THU","FRI","SAT"};
		for(int i=1; i<month; i++) {
			if(i==2) {
				wholeday+=28;
			}
			else if(i==4||i==6||i==9||i==11) {
				wholeday+=30;
			}
			else {
				wholeday+=31;
			}	
		}
		wholeday+=day;
		System.out.print(week[(wholeday%7)]);
	}
}
