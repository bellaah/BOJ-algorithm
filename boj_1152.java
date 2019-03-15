import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
			if(str.equals(" ")) {
				System.out.print(0);
			}
			else {
			if(str.charAt(0)==' ') {
				str=str.substring(1);
			}
			String[] word=str.split(" ");
			System.out.print(word.length);
		}
	}
}
