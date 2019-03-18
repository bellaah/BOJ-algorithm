import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String str=in.next();
		int[] alphabet=new int[26];
		for(int i=0; i<alphabet.length; i++) {
			alphabet[i]=-1;
		}
		for(int i=0; i<str.length(); i++) {
			if(alphabet[str.charAt(i)-97]==-1) {
				alphabet[str.charAt(i)-97]=i;
			}
		}
		for(int i=0; i<alphabet.length; i++) {
			System.out.print(alphabet[i]+" ");
		}
	}
}
