import java.util.Scanner;
/*
https://www.acmicpc.net/problem/4344
*/
public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int Line=in.nextInt();
		double[] percent=new double[Line];
		for(int j=0; j<Line; j++) {
			int num=in.nextInt();
			double sum=0,Average=0,count=0;
			int[] score=new int[num];
				for(int i=0; i<num; i++) {
					score[i]=in.nextInt();
					sum+=score[i];
				}
				Average=sum/num;
				for(int i=0; i<num; i++) {
					if(score[i]>Average) {
						count++;
					}
				}
				percent[j]=count/num*100;
		}
		for(int i=0; i<Line; i++) {
			System.out.println(String.format("%.3f", percent[i])+"%");
		}
}
}
