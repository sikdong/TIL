package codingtestStudy;

import java.util.Scanner;

public class P11047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int coinKind = sc.nextInt();
        int goal = sc.nextInt();
        int[] coins = new int[coinKind];

        for(int i = 0; i < coinKind; i++){
            coins[i] = sc.nextInt();
        }

        int quantity = 0;
            for(int i = coins.length-1; i >= 0; i--){
                if(coins[i] <= goal){
                    quantity += goal / coins[i];
                    goal -= (goal / coins[i]) * coins[i];
                    System.out.println(goal);
                }
                if(goal == 0){
                    System.out.println(quantity);
                    break;
                }
            }
    }
}
