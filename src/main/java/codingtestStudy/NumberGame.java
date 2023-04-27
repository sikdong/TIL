package codingtestStudy;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class NumberGame {
    public static void main(String[] args) {
        int answer = solution(new int[]{1,4,7,13,25}, new int[]{2,9,11,12,15});
        System.out.println(answer);
        PriorityQueue<String> q1 = new PriorityQueue<>();

    }
    public static int solution(int[] a, int[] b) {
        int answer = 0;
        Arrays.sort(a);
        Arrays.sort(b);
        Queue<Integer> pq1 = new LinkedList<>();
        Queue<Integer> pq2 = new LinkedList<>();

        for(int i = 0; i < a.length; i++) {
            pq1.add(a[i]);
            pq2.add(b[i]);
        }


       while(!pq2.isEmpty()){
           int temp = 0;
            if(pq1.peek() < pq2.peek()){
                pq1.poll();
                pq2.poll();
                answer++;
            } else {
                pq2.poll();
            }
        }

        return answer;
    }
}
