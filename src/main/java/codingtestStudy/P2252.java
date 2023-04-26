package codingtestStudy;

import java.io.BufferedReader;
import java.util.*;

public class P2252 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nodeNum = sc.nextInt();
        int edgeNum = sc.nextInt();
        int[] list = new int[nodeNum+1];
        List<Integer>[] info = new ArrayList[nodeNum+1];
        for(int i = 0; i < info.length; i++){
            info[i] = new ArrayList<>();
        }

        for(int i = 1; i <= nodeNum; i++){
            list[i] = 0;
        }
        for(int i = 0; i < edgeNum; i++){
            int s = sc.nextInt();
            int e = sc.nextInt();
            info[s].add(e); //키 순서에 대한 정보 넣기
            list[e]++; //진입 차수 배열 초기화
        }

        Queue<Integer> q = new LinkedList<>();

        for(int i = 1; i <= nodeNum; i++){
            if(list[i] == 0) q.add(i);
        }

        while(!q.isEmpty()){
            int zero = q.poll();
            System.out.print(zero + " ");
            for(int i : info[zero]){
                list[i]--;
                if(list[i] == 0){
                    q.add(i);
                }
            }
        }


    }
}
