package codingtestStudy.dfs;

import java.util.Stack;

public class HateSameNumber {

    int[] solution(int[] arr){
        Stack<Integer> s = new Stack<>();
        s.push(arr[0]);
        for(int i = 1; i < arr.length; i++){
            if(s.peek() != arr[i]) {
                s.push(arr[i]);
            }
        }

        System.out.println(s);
        System.out.println(s.size());

        int[] answer = new int[s.size()];
        for(int i = s.size()-1; i > -1; i--){
            answer[i] = s.pop();
        }
        return answer;
    }


    public static void main(String[] args) {
        int[] arr = {1,1,3,3,0,1,1};
        HateSameNumber hsn = new HateSameNumber();
        int[] answer = hsn.solution(arr);

    }
}

