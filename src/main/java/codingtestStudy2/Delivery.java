package codingtestStudy2;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class Delivery {
    static int N;
    static int[][] road;
    static int K;
    public static void main(String[] args) {
        road = new int[][]{{1,2,1},{2,3,3},{5,2,2},{1,4,2},{5,3,1},{5,4,2}};
        N = 5;
        K = 3;
        System.out.println(solution(N, road, K));
    }

    public static int solution(int N, int[][] road, int K) {
        int answer = 0;
        Stack<Integer> s = new Stack<>();
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < road.length; i++){
            if(road[i][0] == 1){
                s.push(road[i][1]);
            }

            if(road[i][0] > road[i][1]){
                int temp = road[i][0];
                road[i][0] = road[i][1];
                road[i][1] = temp;
                System.out.println(road[i][0]);
                System.out.println(road[i][1]);
            }
        }

        while(!s.isEmpty()){
            int node = s.pop();
            for(int i = 0; i< road.length; i++){
                if(road[i][0] == node){
                    answer+=road[i][2];
                    s.push(road[i][1]);
                }

                if(answer <= K){
                    set.add(node);
                }
            }
        }

        return set.size();
    }
}
