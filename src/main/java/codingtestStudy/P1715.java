package codingtestStudy;

import java.util.PriorityQueue;
import java.util.Scanner;

public class P1715 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        PriorityQueue<Long> pq = new PriorityQueue<>();

        for(int i = 0; i < number; i++){
            pq.add(sc.nextLong());
        }
        //int 범위가 넘을 수 있으니 long으로
        long first;
        long second;
        long sum = 0;
            //우선순위 큐에 데이터가 1개 남을 때 까지
            while(pq.size() > 1){
                first = pq.poll();
                second = pq.poll();
                sum += first + second;
                pq.add(first + second);
            }


        System.out.println(sum);

    }
}
