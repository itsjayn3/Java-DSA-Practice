package Challenges;

public class MaxNum {
    public static int maxNum (int[] nums){

        int maxValue = nums[0];
        for(int i = 1; i < nums.length ; i ++){
            if( maxValue < nums[i]){
                maxValue = nums[i];
            }
        }
        return maxValue;
    }
}
