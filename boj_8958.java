import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		String[] OX=new String[num];
		int[] score=new int[num];
		for(int i=0; i<num; i++) {
			OX[i]=in.next();
		}
		for(int i=0; i<OX.length; i++) {
			int currentSc=0;
			for(int j=0; j<OX[i].length(); j++) {
				if(OX[i].charAt(j)=='O') {
					score[i] += ++currentSc;
				}else {
					currentSc=0;
				}
			}
		}
		for(int i=0; i<score.length; i++) {
			System.out.println(score[i]);
		}
	}
}
