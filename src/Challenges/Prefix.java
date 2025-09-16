package Challenges;

import java.util.Arrays;

public class Prefix {
    public static int prefix(int[] nums){

        int[] prefix = new int[nums.length];

        prefix[0] = nums[0];

        for(int i = 1; i < prefix.length; i++){
            prefix[i] = prefix[i-1] + nums[i];

        }
        System.out.println(Arrays.toString(prefix));
        return 0;
    }
}
