import java.io.*;
import java.util.*;
/*
https://www.acmicpc.net/problem/1753
*/
public class Main{
	public static void main(String[] args) throws IOException {
		Scanner in=new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int v = Integer.parseInt(st.nextToken());
        int e = Integer.parseInt(st.nextToken());
        int curr = Integer.parseInt(br.readLine());
		
		int a,b,cost;
		boolean[] visited=new boolean[v+1];
		int[] costTable=new int[v+1];
		List<List<String>> graph=new ArrayList<>();
		String[] tmp=new String[2];
		
		for(int i=0; i<v+1; i++) {
			graph.add(new ArrayList<>());
			costTable[i]=2000001;
		}
		costTable[curr]=0;
		for(int i=0; i<e; i++) {
			st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            cost = Integer.parseInt(st.nextToken());
	         graph.get(a).add(b+","+cost);
		}
		int count=0;
		int min=2000002;
		while(count!=v-1) {
			min=2000002;
			visited[curr]=true;
			for(int i=0; i<graph.get(curr).size(); i++) {
				tmp=graph.get(curr).get(i).split(",");
				a=Integer.parseInt(tmp[0]);
				cost=Integer.parseInt(tmp[1]);
				
				if(costTable[a]>costTable[curr]+cost) {
					costTable[a]=costTable[curr]+cost;
				}
			}
			for(int i=1; i<v+1; i++) {
				if(!visited[i]&&min>costTable[i]) {
					min=costTable[i];
					curr=i;
				}
			}
			count++;
		}
		for(int i=1; i<v+1; i++) {
			if(costTable[i]==2000001) {
				System.out.println("INF");
			}else {
			System.out.println(costTable[i]);
			}
		}
	}
}
