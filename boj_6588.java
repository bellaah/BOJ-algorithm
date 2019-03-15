import java.io.*;
import java.util.*;
/*
https://www.acmicpc.net/problem/6588
*/
public class Main{

	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner in= new Scanner(System.in);
		int num;
		int[] isprime= new int[1000001];	//1이면 소수
		ArrayList<Integer> prime=new ArrayList<>();
		isprime[0]=isprime[1]=2;
		for (int i=2; i<1000001; i++)	//소수 미리구해놓기 
	    {
	       if(isprime[i]==0) {
	    	   isprime[i]=1;
	    	   prime.add(i);
	    	   for (int j=2; j<1000001/i; j++){
	    			if(isprime[i*j]==0) {
	    				isprime[i*j]=2;
	    		   }    
	    	   }
	       }
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sub=0,start=0,end=0,tmp=0;
		while(true) {
			num=Integer.parseInt(br.readLine());
			if(num==0) {
				break;
			}
			start=end=tmp=0;
			sub=-1;
			for(int i=0; i<num; i++) {	//num보다 작은 최대소수 
				if(isprime[num-i]==1) {
					tmp=prime.indexOf(num-i);
					break;
				}
			}
			for(int i=0; i<=tmp; i++) {
					if(isprime[num-prime.get(i)]==1) {
						sub=(num-prime.get(i))-prime.get(i);
						start=prime.get(i);
						end=num-prime.get(i);
						break;
					}
			}
			if(sub==-1) {
				System.out.println("Goldbach's conjecture is wrong");
			}
			else {
				System.out.println(num+" = "+start+" + "+end);
			}
		}
	}
}
