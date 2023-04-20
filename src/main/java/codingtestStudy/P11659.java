package codingtestStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11659 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int wholeNumber = Integer.parseInt(st.nextToken());
        int qNumber = Integer.parseInt(st.nextToken());
        long[] list = new long[wholeNumber];
        list[0] = 0;
        st= new StringTokenizer(br.readLine());
        for(int i = 1; i < list.length; i++){
            list[i] = list[i-1] + Integer.parseInt(st.nextToken());
        }

        for(int i = 1; i < qNumber; i++){
            st= new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            System.out.println(list[b] - list[a - 1]);
        }
    }
}
