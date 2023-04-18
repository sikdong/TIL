package codingtestStudy;

public class TargetNumber {
    int count = 0;


    public static void main(String[] args) {
        TargetNumber test = new TargetNumber();
        int[] numbers = {1, 1, 1, 1};
        int target = 3;
        System.out.println(test.solution(numbers, 3));
    }

    public int solution(int[] numbers, int target) {


        dfs(numbers, 0, 4, target, 0);
        System.out.println(count);
        return count;

    }
        public void dfs( int[] numbers, int depth, int length, int target, int sum){
            if (depth == length) {
                if (sum == target) {
                    count++;
                    System.out.println(count);
                }
            } else {
                dfs(numbers, depth + 1, length, target, sum + numbers[depth]);
                dfs(numbers, depth + 1, length, target, sum - numbers[depth]);
            }
        }
}

