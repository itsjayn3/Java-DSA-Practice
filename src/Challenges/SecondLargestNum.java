package Challenges;

import java.util.Arrays;

public class SecondLargestNum {
    public static int secondLargestNum(int[]nums){
        if(nums.length == 0)
            return 0;

        Arrays.sort(nums);
        return nums[nums.length - 2];

    }
}
