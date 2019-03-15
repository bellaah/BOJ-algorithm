import java.io.*;
import java.util.*;
/*
https://www.acmicpc.net/problem/1717
*/
public class Main {
    static int VMAX =1000001;
    static int r[] = new int[VMAX];
    static int st[] = new int[VMAX];
    static int group_loop(int node)
    {
        int cur = node, top = 0;
        while(r[cur] != cur)
        {
            st[top++] = cur;
            cur = r[cur];
        }
        for(int i=0;i<top;i++) r[st[i]]=cur;
        return cur;
    }
    static int group(int node)
    {
        if(node == r[node]) return node;
        else return r[node] = group(r[node]);
    }
    static void join(int a, int b)
    {
        r[group_loop(b)] = group_loop(a);
    }

    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        for(int i = 0 ; i <= N ; i++)
        {
            r[i] = i;
        }
        for(int i = 0 ; i < M ; i++)
        {
            int op, a, b;
            st = new StringTokenizer(br.readLine());
            op = Integer.parseInt(st.nextToken());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            if(op == 0)
            {
                join(a,b);
            }
            else if(op == 1)
            {
                if(group_loop(a) == group_loop(b)) bw.write("YES\n");
                else bw.write("NO\n");
            }
        }
        bw.flush();
    }
}
