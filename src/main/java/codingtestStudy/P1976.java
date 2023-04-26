package codingtestStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class P1976 {
    static int[] parent;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cityNum = Integer.parseInt(st.nextToken());
        int travelCity = Integer.parseInt(st.nextToken());
        int[][] cityInfo = new int[cityNum + 1][cityNum + 1];
        parent = new int[travelCity];
        List<Integer> route = new ArrayList<>();
        for(int i = 1; i <= cityNum; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 1; j<=cityNum; j++){
                cityInfo[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < travelCity; i++){
            route.add(i,Integer.parseInt(st.nextToken()));
        }

        for(int i = 0; i < route.size(); i++){
            parent[route.get(i)] = route.get(i);
        }
        //여기까지 데이터 받아서 초기화


        for(int i = 1; i <=cityNum; i++){
            for(int j = 1; j <= cityNum; j++){
                if(i == j){
                    continue;
                } else if(i < j && cityInfo[i][j] == 1) {
                    union(i , j);
                }
            }
        }


    }
    public static void union(int a, int b){
        a = find(a);
        b = find(b);

        if(a < b){
            parent[b] = a;
        }

    }

    public static int find(int a){
        if(a == parent[a]){
            return a;
        } else {
            return parent[a] = find(parent[a]);
        }
    }
}
