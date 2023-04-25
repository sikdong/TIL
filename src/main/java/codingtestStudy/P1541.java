package codingtestStudy;

import java.util.Scanner;

public class P1541 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] seg = s.split("-");
        int answer = 0;
        for(int i = 0; i < seg.length; i++){
            if(i == 0){
                answer += Integer.parseInt(seg[i]);
            } else {
                answer -=plus(seg[i]);
            }
        }
        System.out.println(answer);
    }
    static int plus(String s){
        int sum = 0;
        String[] a = s.split("\\+");
        for(int i = 0; i < a.length; i++){
            int n = Integer.parseInt(a[i]);
            sum += n;
        }
        return sum;
    }
}
