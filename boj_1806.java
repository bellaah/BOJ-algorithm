import java.util.Scanner;
/*
https://www.acmicpc.net/problem/1806
*/
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int N=in.nextInt(),M=in.nextInt();
		int successNum=0,sum=0,count=0,min=100001;
		int[] arr=new int[N];
		for(int i=0; i<N; i++){
			arr[i]=in.nextInt();
		}
		for(int i=0; i<N; i++){
			sum=0;
			count=0;
			for(int j=i; j<N; j++){
				count++;
				sum+=arr[j];
				if(count>min) {
					break;
				}
				if(sum>=M){
					successNum++;
					if(min>count) {
						min=count;
					}
					break;
				}
			}
		}
		if(successNum==0) {
			System.out.println(0);
		}
		else {
	
		System.out.println(min);
		}
	}

}
