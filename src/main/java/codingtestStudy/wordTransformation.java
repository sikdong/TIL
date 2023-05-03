package codingtestStudy;

import java.util.*;

public class wordTransformation {
    static boolean[] visited;
    static int temp;
    public static void main(String[] args) {
        int a = solution("hit", "cog", new String[]{"hot", "dot", "dog", "lot", "log", "cog"});
        System.out.println(a);
    }

    public static int solution(String begin, String target, String[] words) {
        int answer = 0;
        temp= Integer.MAX_VALUE;
        visited = new boolean[words.length];
        dfs(begin, target, words, 0);
        return temp;
    }

    static void dfs(String begin, String target, String[] words, int depth) {
        if(begin.equals(target) && temp > depth){
            temp = depth;
        }
        int count;
        for(int i = 0; i < words.length; i++){
                count = 0;
                if(visited[i] == true){
                    continue;
                }
            for(int j = 0; j < begin.length(); j++){
                if(words[i].charAt(j)==begin.charAt(j)){
                    count++;
                }
            }
            if(count == begin.length()-1){
                visited[i] = true;
                dfs(words[i], target, words, depth+1);
            }
            visited[i] = false;
        }
    }


}
