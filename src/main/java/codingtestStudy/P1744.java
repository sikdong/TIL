package codingtestStudy;

import java.util.PriorityQueue;
import java.util.Scanner;

public class P1744 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PriorityQueue<Integer> plusPq = new PriorityQueue<>();
        PriorityQueue<Integer> minusPq = new PriorityQueue<>();

        for(int i = 0; i < n; i++){
            int temp = sc.nextInt();
            if(temp > 0){
                plusPq.add(temp);
            } else {
                minusPq.add(temp);
            }
        }

        int sum = 0;
        while(minusPq.size()!=0){
            int data1 = minusPq.poll();
            int data2 = minusPq.poll();
            sum += data1 * data2;

            if(minusPq.size() == 1){
                int lastData = minusPq.poll();
                sum += lastData;
            }
        }
        System.out.println(sum);
        while(plusPq.size()!=0){
            int temp = plusPq.poll();
            if(temp == 1){
                sum += temp + plusPq.poll();
            }
            sum += plusPq.poll() * plusPq.poll();

        }
        System.out.println(sum);
    }
}
