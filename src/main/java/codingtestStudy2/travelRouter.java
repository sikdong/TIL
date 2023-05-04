package codingtestStudy2;

import java.util.List;

public class travelRouter {
    static boolean[] visited;
    static String[] answer;
    static String[] equal;
    public static void main(String[] args) {

        String[] answers = solution(new String[][]{{"ICN", "JFK"}, {"HND", "IAD"}, {"JFK", "HND"}});
        for(int i = 0; i < answers.length; i++){
            System.out.println(answers[i]);
        }
    }
    public static String[] solution(String[][] tickets) {
        answer = new String[tickets.length+1];
        visited = new boolean[tickets.length+1];
        equal = new String[tickets.length];
        dfs(tickets[0][0], tickets, answer, 0);
        return answer;
    }

    public static void dfs(String ticket, String[][] tickets, String[] answer, int depth){
        if(depth == answer.length){
            return;
        }
        answer[depth] = ticket;

        int temp = Integer.MAX_VALUE;
        int number = 0;
        for(int i = 0; i < tickets.length; i++){
            if(visited[i] == true){
                continue;
            }
            int compare = (int)tickets[i][1].charAt(0)-64;

            if(tickets[i][0].equals(ticket) && temp > compare){
                temp = compare;
                number = i;
            } else if(tickets[i][0].equals(ticket) && temp == compare){
                if((int)tickets[i][1].charAt(1)-64 > (int)tickets[number][1].charAt(1)-64){
                    number = i;
                } else if((int)tickets[i][1].charAt(1)-64 == (int)tickets[number][1].charAt(1)-64){
                    if((int)tickets[i][1].charAt(2)-64 > (int)tickets[number][1].charAt(2)-64){
                        number = i;
                    }
                }
            }
        }
        visited[number] = true;
        dfs(tickets[number][1], tickets, answer, depth+1);
    }
}
