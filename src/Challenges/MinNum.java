package Challenges;

public class MinNum {
    public static int minNum(int[] nums){
        int minValue = nums[0];

        for(int i = 1; i < nums.length; i++){
            if( minValue > nums[i]){
                minValue = nums[i];
            }
        }
        return minValue;
    }
}
