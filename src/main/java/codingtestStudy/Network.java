package codingtestStudy;

public class Network {
    int n = 9;
    int [][] computers = {{1, 1, 0, 0, 0, 0, 0, 0, 0},
                          {1, 1, 0, 1, 0, 0, 0, 0, 0},
                          {0, 0, 1, 0, 1, 0, 1, 0, 0},
                          {0, 1, 0, 1, 0, 1, 0, 0, 0},
                          {0, 0, 1, 0, 1, 0, 1, 0, 0},
                          {0, 0, 0, 1, 0, 1, 0, 0, 0},
                          {0, 0, 1, 0, 1, 0, 1, 0, 0},
                          {0, 0, 0, 0, 0, 0, 0, 1, 1},
                          {0, 0, 0, 0, 0, 0, 0, 1, 1}};

    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited = new boolean[n];

        for(int i = 0; i < n; i++){
            System.out.println(visited[i]);
            if(visited[i] == false){
                dfs(computers, i, i, visited);
                answer++;
            }
            System.out.println("현재 네트워크 수는 " + answer);
        }
        return answer;
    }

    public static void main(String[] args) {
        Network nw = new Network();
       int answer = nw.solution(nw.n, nw.computers);
        System.out.println("정답은 " + answer);
    }

    void dfs(int[][] computers, int x, int y, boolean[] visited){
        //방문한 노드 처리
        visited[x] = true;

        for(int i = 0; i < computers.length; i++){
            if(x != i && visited[i] == false && computers[x][i] == 1 ){
                System.out.println("현재 노드는 " + i);
                dfs(computers, i, i, visited);
            }
        }
    }
}
