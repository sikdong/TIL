package codingtestStudy;

import java.io.*;
import java.util.Stack;

public class P17298 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        String[] list = br.readLine().split(" ");
        int[] temp = new int[list.length];
        for(int i = 0; i < list.length; i++){
           temp[i] = Integer.parseInt(list[i]);
        }
        Stack<Integer> s = new Stack<>();
        int[] answer = new int[list.length];

        s.push(0);

        for(int i = 1; i < size; i++){
            while(!s.isEmpty() && temp[s.peek()] < temp[i]){
                answer[s.pop()] = temp[i];
            }
            s.push(i);
        }

        for(int i = 0; i < s.size(); i++){
            answer[s.pop()] = -1;
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0; i < size; i++){
            bw.write(answer[i] + " ");
        }
        bw.write("\n");
        bw.flush();
        bw.close();
    }
}
