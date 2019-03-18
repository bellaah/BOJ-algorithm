import java.io.*;
import java.util.*;

public class Main{
	static char[] str1, str2;
    static List<Character> ans;
    static int[][] dp;
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
       String a=in.nextLine();
       String b=in.nextLine();
        str1=new char[a.length()+1];
        str2=new char[b.length()+1];
     
       for(int i=0; i<a.length(); i++) {
    	   str1[i+1]=a.charAt(i);
       }
       for(int i=0; i<b.length(); i++) {
    	   str2[i+1]=b.charAt(i);
       }
       
       dp= new int[str1.length][str2.length];
       for(int i=1; i<str1.length; i++) {
    	   for(int j=1; j<str2.length; j++) {
    		   if(str1[i]==str2[j]) {
    			   dp[i][j]=dp[i-1][j-1]+1;
    		   }
    		   else{
    			   if(dp[i-1][j]>dp[i][j-1]) {
    				   dp[i][j]=dp[i-1][j];
    			   }

    			   else {
    				   dp[i][j]=dp[i][j-1];
    			   }
    		   }
    	   }
       }
       System.out.println(dp[str1.length-1][str2.length-1]);
       ans = new ArrayList<Character>();
       getRoute(str1.length-1, str2.length-1);
       for ( int i=ans.size()-1; i>=0; i-- ) System.out.print(ans.get(i));
       System.out.println();
	}
	static void getRoute(int r, int c) {
        if ( r == 0 || c == 0 ) return;
        if (str1[r] == str2[c] ) {
            ans.add(str1[r]);
            getRoute(r-1, c-1);
        } else {
            if ( dp[r-1][c] > dp[r][c-1] ) getRoute(r-1, c);
            else getRoute(r, c-1);
        }
    }
}
