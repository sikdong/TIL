package codingtestStudy.dfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GameMap {
    // 상하좌우 방향 표시
    int[] dx = {-1, 1, 0, 0};
    int[] dy = {0,0,-1, 1};
    int[][] maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};

    public static void main(String[] args) {
        GameMap gm = new GameMap();
        Queue<int[]> q = new LinkedList<>();
        int[][] visited = new int[gm.maps.length][gm.maps[0].length];
        gm.bfs(q, visited);
        int answer = visited[gm.maps.length-1][gm.maps[0].length-1];
        System.out.println(answer);


    }

    void bfs(Queue<int[]> q, int[][] visited){
        //큐에 현재 좌표 노드 넣고 표시
        q.add(new int[]{0,0});
        while(!q.isEmpty()){
            int[] now = q.poll();
            int x = now[0];
            int y = now[1];
            visited[0][0] = 1;

            //상하좌우 탐색
            for(int i = 0; i < 4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];

                if(nx >= 0 && nx < maps.length && ny >=0 && ny < maps[0].length
                        && visited[nx][ny] ==0 &&maps[nx][ny] != 0 ){
                    visited[nx][ny] = visited[x][y] + 1;
                    q.add(new int[]{nx, ny});
                }
            }
        }
    }
}



