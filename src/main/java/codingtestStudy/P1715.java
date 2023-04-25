package codingtestStudy;

import java.util.List;
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
        long first;
        long second;
        long sum = 0;

            while(pq.size() > 1){
                first = pq.poll();
                second = pq.poll();
                sum += first + second;
                pq.add(first + second);
            }


        System.out.println(sum);

    }
}
