import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int sum=0,tmp=0;
		for(int i=0; i<5; i++) {
			tmp=in.nextInt();
			if(tmp<40) {
				tmp=40;
			}
			sum +=tmp;
		}
		System.out.print(sum/5);
	}
}
