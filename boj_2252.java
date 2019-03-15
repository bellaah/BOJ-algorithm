import java.io.*;
import java.util.*;
/*
https://www.acmicpc.net/problem/2252
*/
public class Main{
	static int[] degree; 
	static List<List<Integer>> graph;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Queue<Integer> queue=new LinkedList();
		int n=Integer.parseInt(st.nextToken());			//학생 수 
		int m=Integer.parseInt(st.nextToken());	
		int a,b;
		graph=new ArrayList<>();	//인접리스트 
		degree=new int[n+1];	//차수 
		int[] first=new int[m];		//들어온 입력의 첫번째 수  
		
		for(int i=1; i<=n+1; i++) {		//리스트 생성 
			graph.add(new ArrayList<>());
		}
		
		for(int i=0; i<m; i++) {	//m만큼의 입력을 받는다. 
			st = new StringTokenizer(br.readLine());
			a=Integer.parseInt(st.nextToken());	
			b=Integer.parseInt(st.nextToken());	
			graph.get(a).add(b);
			first[i]=a;
			degree[b]++;	
		}
		
		for(int i=1; i<=n; i++) {
			if(degree[i]==0) {	//degree가 0이면 큐에 넣는다.
				queue.add(i);
				degree[i]=-1;
			}
		}
		
		for(int i=0; i<n; i++) {
			if(!queue.isEmpty()) {
			 int x = queue.poll();	//큐에서 빼고 출력 
			 bw.write(x+" ");
			 for(int j=0; j<graph.get(x).size(); j++) {	//큐에서 뺀 x의 인접리스트 
				 degree[graph.get(x).get(j)]--;
				 if(degree[graph.get(x).get(j)]==0) {
					 queue.add(graph.get(x).get(j));
					 degree[graph.get(x).get(j)]=-1;
				 }
			 }
			}
		}
		bw.flush();
	}
}
