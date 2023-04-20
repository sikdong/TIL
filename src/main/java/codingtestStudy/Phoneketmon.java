package codingtestStudy;

import java.util.*;

public class Phoneketmon {
    int[] nums = {3,3,3,2,2,4};
    public int solution(int[] nums) {
        int count = nums.length/2;
        int answer = 0 ;
        Map<Integer, Integer> map = new HashMap<>();
        int number = 0;
        for(int i = 0; i < nums.length; i++){
                number = 0;
            for(int j = 0; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    number++;
                }
            }
            map.put(nums[i], number);
        }
        System.out.println(map);
        System.out.println(map.size());
        if(map.size() < count){
            return map.size();
        }

        return count;
    }

    public static void main(String[] args) {
        Phoneketmon p = new Phoneketmon();
        int[] nums = {3,3,3,2,2,4};
        int answer = p.solution(nums);
        System.out.println(answer);
    }
}
