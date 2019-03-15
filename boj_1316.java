import java.util.Scanner;
/*
https://www.acmicpc.net/problem/1316
*/
public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		String[] data=new String[num];
		int count=0;
		for(int i=0; i<num; i++) {
			data[i]=in.next();
		}
		boolean[] groupNum=new boolean[num];
		for(int i=0; i<num; i++) {
			char[] spel=new char[data[i].length()];
			int tmp=0;
			for(int j=0; j<data[i].length(); j++) {
				spel[tmp++]=data[i].charAt(j);
				if(tmp>1 && spel[tmp-2]!=data[i].charAt(j)) {
					for(int k=0; k<tmp-1; k++) {
						if(spel[k]==data[i].charAt(j)) {
							groupNum[i]=true;
							break;
						}
					}
				}
				if(groupNum[i]) {
					break;
				}
			}
		}
		for(int i=0; i<num; i++) {
			if(!groupNum[i]) {
				count++;
			}
		}
		System.out.print(count);
	}
}
