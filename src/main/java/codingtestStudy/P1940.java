package codingtestStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1940 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int ingredients = Integer.parseInt(st.nextToken());
        int number = Integer.parseInt(st.nextToken());
        int[] array = new int[ingredients];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < ingredients; i++){
            array[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(array);
        int i = 0;
        int j = ingredients-1;
        int count = 0;
        int sum = array[i] + array[j];
        while(i < j){
            if(sum == number){
                count++;
                i++;
                j--;
            }else if(sum > number){
                    j--;
            } else {
                i++;
            }
        }
        System.out.println(count);
        br.close();
    }
}
