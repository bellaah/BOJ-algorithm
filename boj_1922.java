import java.util.*;
/*
https://www.acmicpc.net/problem/1922
*/
public class Main{
	static class Edge implements Comparable<Edge>{
	    int from, to, cost;
	    public int compareTo(Edge arg0) {
	        return this.cost - arg0.cost;
	    }
	};
	static int root[] = new int[1001];
	static int group(int node)
    {
        if(root[node]==node) {
        	return node;
        }
        else {
        	return root[node] = group(root[node]);
        }
    }
	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();		
	int m=in.nextInt();
	int a,b,cost;

	Edge E[] = new Edge[m];
	for(int i=0;i<n;i++) {
		root[i]=i;
	}
	for(int i=0; i<m; i++) {
		E[i] = new Edge();
		a=in.nextInt();
		b=in.nextInt();
		cost=in.nextInt();
		 E[i].from = a;
         E[i].to = b;
         E[i].cost = cost;
	}
	Arrays.sort(E,0,m);	
	int sum=0;
	for(int i=0; i<m; i++) {
		if(group(E[i].from) != group(E[i].to)) {
			root[group(E[i].from)] = group(E[i].to);
			sum+=E[i].cost;
		}
	}
	System.out.print(sum);
	}
}
