package codingtestStudy;

import java.util.Scanner;

public class P11047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int coinKind = sc.nextInt();
        int goal = sc.nextInt();
        int[] coins = new int[coinKind];

        //입력된 동전 값 배열에 넣기
        for(int i = 0; i < coinKind; i++){
            coins[i] = sc.nextInt();
        }
        //동전 개수
        int quantity = 0;
            for(int i = coins.length-1; i >= 0; i--){
                //목표 금액보다 같거나 작은 경우 coins[i]가 무엇인지 확인
                if(coins[i] <= goal) {
                    quantity += goal / coins[i];
                    goal -= (goal / coins[i]) * coins[i];
                }
            }
        System.out.println(quantity);
    }
}
