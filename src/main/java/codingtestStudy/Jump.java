package codingtestStudy;

public class Jump {
    public static void main(String[] args) {
        int n = 5000;
        System.out.println(solution(n));

    }
    public static int solution(int n) {
        int ans = 0;
        while(true){
            if(n == 0){
                break;
            }
            if(n % 2 == 0){
                n = n/2;
            } else {
                n--;
                ans++;
                n = n/2;
            }
        }

        return ans;
    }
}
