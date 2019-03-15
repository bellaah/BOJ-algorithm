import java.io.*;
import java.util.*;
/*
https://www.acmicpc.net/problem/1644
*/
public class Main{
 
    public static void main(String[] args) 
    {
    	boolean isPrime[] = new boolean[4000001];
    	int pcnt=0, prime[] = new int[4000001];
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int s=0,e=0,ans=0,sum=0;
        for(int i = 2 ; i <= N ; i++) {
        	isPrime[i] = true;
        }
        for(int i = 2; i <= N; i++)
        {
            if(isPrime[i])
            {
                prime[pcnt++] = i;
                for(int j = i+i ; j <= N ; j+=i) isPrime[j] = false;
            }
        }
        
        while(s<=e&&e<pcnt)
        {
            while(e<pcnt && sum < N) {
            	sum += prime[e++];
            }
            if(sum < N) {
            	break;
            }
            while(s<e && sum > N) {
            	sum -= prime[s++];
            }
            if(sum == N) 
            {
                ans++;
                sum -= prime[s++];
            }
        }
        System.out.println(ans);
    }
}
