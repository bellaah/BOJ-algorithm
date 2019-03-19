import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str=in.next();
		for(int i=0; i<(str.length()/10)+1; i++) {
			if(i==(str.length()/10)) {
				System.out.println(str.substring(i*10,str.length()));
			}
			else {
			System.out.println(str.substring(i*10,(i+1)*10));
			}
		}
	}
}
