package codingtestStudy2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class TreeDiameter {
    static int[] distance;
    static boolean[] visited;
    static ArrayList<Edge>[] nodeList;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int node = Integer.parseInt(st.nextToken());
        nodeList = new ArrayList[node+1];
        for(int i = 1; i <= node; i++){
            nodeList[i] = new ArrayList<Edge>();
        }
        for(int i = 0; i < node; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            while (true) {
                int e = Integer.parseInt(st.nextToken());
                if (e == -1) {
                    break;
                }
                int v = Integer.parseInt(st.nextToken());
                nodeList[s].add(new Edge(e, v));
            }
        }
        distance = new int[node+1];
        visited = new boolean[node+1];
    }
    static void bfs(int index){
        Queue<Integer> q = new LinkedList<Integer>();
        visited[index]= true;
        q.add(index);
        while(!q.isEmpty()){
            int nowNode = q.poll();
            for(Edge i : nodeList[nowNode]){
                int e = i.e;
                int v = i.value;
                if(!visited[e]){
                    visited[e] = true;
                    q.add(e);
                    distance[e] = distance[nowNode]+v;
                }
            }
        }
    }
}
class Edge{
    int e;
    int value;
    public Edge(int e, int value){
        e = this.e;
        value = this.value;
    }
}
