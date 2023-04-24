package codingtestStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P2178 {
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1 ,1};
    static int[][] maze;
    static boolean[][] visited;
    static int n, m;
    static int answer;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        maze = new int[n][m];
        visited = new boolean[n][m];
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            String line = st.nextToken();
            for(int j = 0; j < m; j++){
                maze[i][j] = Integer.parseInt(line.substring(j, j+1));
            }
        }

        bfs(0,0);
        System.out.println(maze[n-1][m-1]);


    }

    static void bfs(int start, int end){
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{start, end});
        visited[start][end] = true;
       //큐에 어떻게 이 노드의 위치를 저장하지?

        while(!q.isEmpty()){
            int[] now = q.poll();
            for(int i = 0; i < 4; i++){
                int x = now[0] + dx[i];
                int y = now[1] + dy[i];
                if(x >= 0 && x < n && y >= 0 && y < m
                        && maze[x][y] != 0 &&visited[x][y] == false){
                    q.add(new int[]{x,y});
                    maze[x][y] = maze[now[0]][now[1]] + 1;
                    visited[x][y] = true;
                }
            }
        }


    }
}

