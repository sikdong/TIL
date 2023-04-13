package codingtestStudy.dfs;

import java.util.Arrays;

public class gymClothes {


    public static void main(String[] args) {
        gymClothes gc = new gymClothes();
        int[] lost = {1,3,5,7,9};
        int[] reserve = {2,4,6,8};
        int answer = borrow(10, lost, reserve);
        System.out.println(answer);
    }

    static int borrow(int n, int[] lost, int[] reserve){
        int sum = 0;
     Arrays.sort(lost);
     Arrays.sort(reserve);

     for(int i = 0; i < lost.length; i++){
        for(int j = 0; j < reserve.length; j++) {
            if (lost[i] == reserve[j]) {
                lost[i] = -3;
                reserve[j] = -3;
                break;
                }
            }
        }
        for(int i = 0; i < reserve.length; i++){
            for(int j = 0; j < lost.length; j++) {
                if (reserve[i]-1 == lost[j] || reserve[i]+1 == lost[j]) {
                    sum++;
                    break;
                }
            }
        }
        return n-(lost.length-sum);
    }
}