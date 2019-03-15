import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int one1 = Integer.parseInt(st.nextToken());
        int one2 = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int two1 = Integer.parseInt(st.nextToken());
        int two2 = Integer.parseInt(st.nextToken());
        int a= one2*two2;
        int b=one1*two2+one2*two1;
        int g=gcd(a,b);
        System.out.print(b/g+" "+a/g);
	}
	public static int gcd(int a,int b) {
		if(b==0)	return a;
		else	return gcd(b,a%b);
	}
}
