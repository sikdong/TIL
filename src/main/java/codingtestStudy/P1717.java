package codingtestStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class P1717 {
    static int[] arr;
    static List<Integer> list;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        arr = new int[n+1];
        List<String> answer = new ArrayList<>();
        for(int i = 1; i <=n; i++){
            arr[i] = i;
        }

        for(int i =0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());
            int third = Integer.parseInt(st.nextToken());
            if(first == 0){
                union(second, third);
            }
            if(first == 1){
                list = new ArrayList<>();
                int a = find(second);
                for(int j = 0; j <list.size(); j++){
                    arr[list.get(j)] = a;
                }
                list = new ArrayList<>();
                int b = find(third);
                for(int j = 0; j <list.size(); j++){
                    arr[list.get(j)] = b;
                }
                if(a == b){
                    answer.add("YES");
                } else {
                    answer.add("NO");
                }
            }
        }
        for(int i = 0; i < answer.size(); i++){
            System.out.println(answer.get(i));
        }
    }

    static void union(int a, int b){
        int c = find(a);
        int d = find(b);
        if(c > d){
            arr[c] = d;
        } else if(c < d) {
            arr[d] = c;
        }
    }

    static int find(int a){
        int b = arr[a];
        if(arr[a] != a){
            list.add(a);
            find(b);
        }
        return b;
    }
}
