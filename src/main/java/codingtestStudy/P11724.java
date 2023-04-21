package codingtestStudy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class P11724 {
    static List<Integer>[] list;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int node = Integer.parseInt(st.nextToken());
        int edge = Integer.parseInt(st.nextToken());
        int count = 0;
        list = new ArrayList[node + 1];
        visited = new boolean[node + 1];
        for (int i = 1; i < node; i++) {
            list[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < edge; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            list[s].add(e);
            list[e].add(s);
        }

        for (int i = 1; i < node + 1; i++) {
            if(!visited[i]){
                count++;
                dfs(i);
            }
        }
        System.out.println(count);
    }
    static void dfs(int v){
        if(visited[v]){
            return;
        }
        visited[v] = true;
        for(int i : list[v]){
            if(visited[i] == false){
                dfs(i);
            }
        }
    }
}
