package codingtestStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.CookieHandler;
import java.util.*;

public class P1260 {
    static ArrayList<Integer>[] graph;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int node = Integer.parseInt(st.nextToken());
        int edge = Integer.parseInt(st.nextToken());
        int startNode = Integer.parseInt(st.nextToken());
        graph = new ArrayList[node+1];


        for(int i = 1; i <= node; i++){
            graph[i] = new ArrayList<>();
        }

        for(int i = 0; i < edge; i++){
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            graph[s].add(e);
            graph[e].add(s);
        }

       for(int i = 1; i<= node; i++){
           Collections.sort(graph[i]);
       }
        visited = new boolean[node+1];
        dfs(startNode);
        System.out.println();

        visited = new boolean[node+1];
        bfs(startNode);
        System.out.println();
    }

    static void dfs(int now){
        System.out.print(now + " ");
        visited[now] = true;
        for(int i : graph[now]){
            if(!visited[i]){
                dfs(i);
            }
        }
    }

    static void bfs(int now){
        Queue<Integer> q = new LinkedList<>();
        q.add(now);
        visited[now] =  true;

        while(!q.isEmpty()){
            int now_node = q.poll();
            System.out.println(now_node + " ");
            for(int i : graph[now_node]){
                if(!visited[i]){
                    q.add(i);
                    visited[i] = true;
                }
            }
        }
    }
}
