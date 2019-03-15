import java.util.Scanner;
/*
https://www.acmicpc.net/problem/1157
*/
public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String word=in.nextLine();
		int[] alpha=new int[26];
		for(int i=0; i<word.length(); i++) {
			if(Character.isLowerCase(word.charAt(i))) {
				alpha[word.charAt(i)-97]++;
			}
			else {
				alpha[word.charAt(i)-65]++;
			}
		}	
		int num=0;
		char top = 0;
		boolean Isone=true;
		for(int i=0; i<alpha.length; i++) {
			if(alpha[i]>num) {
				top=(char)(i+65);
				num=alpha[i];
				Isone=true;
			}
			else if(alpha[i]==num) {
				Isone=false;
			}
		}
		if(!Isone) {
			System.out.print("?");
		}
		else {
			System.out.print(top);
		}
	}
}
