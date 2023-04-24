package codingtestStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class P13023 {
    static boolean[] visited;
    static List<Integer>[] graph;
    static boolean arrive;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int node = Integer.parseInt(st.nextToken());
        int edge = Integer.parseInt(st.nextToken());

        visited = new boolean[node];
        graph = new ArrayList[node];
        for (int i = 0; i < node; i++) {
            graph[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < edge; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            graph[s].add(e);
            graph[e].add(s);
        }

        for(int i = 0; i < node; i++){

                dfs(i,1);
            if(arrive){
                break;
            }
        }

        if(arrive){
            System.out.println("1");
        } else {
            System.out.println("0");
        }

    }

    static void dfs(int now, int depth) {
        if(depth == 5 || arrive){
            // 5에 충족하다는 것을 어떻게 알려줄까?
            arrive = true;
            return;
        }
        visited[now] = true;

        for(int i : graph[now]){
            if(visited[i] == false) {
                dfs(i, depth + 1);
            }
        }
        visited[now] = false;
    }
}
