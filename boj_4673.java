import java.util.Scanner;
/*
https://www.acmicpc.net/problem/4673
*/
public class Main {
	public static void main(String[] args) {
		String tmp="";
		boolean[] check=new boolean[10001];
		
		for(int i=0; i<=10000; i++) {
			tmp=String.valueOf(i);
					if((int)Math.log10(i)==0) {
						check[i+i]=true;
					}else if((int)Math.log10(i)==1) {
						check[i+(i/10)+(i%10)]=true;
					}else if((int)Math.log10(i)==2) {
						check[(i+(i/100)+(tmp.charAt(1)-48)+(i%10))]=true;
					}else if((int)Math.log10(i)==3) {
						if(i+(i/1000)+(tmp.charAt(2)-48)+(tmp.charAt(1)-48)+(i%10)<=10000) {
						check[(i+(i/1000)+(tmp.charAt(2)-48)+(tmp.charAt(1)-48)+(i%10))]=true;
						}
					}
		}
		for(int i=1; i<check.length; i++) {
			if(check[i]==false) {
				System.out.println(i);
			}
		}
	}
}
