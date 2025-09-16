package Challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinDifference {
    public static int minDifference ( int[] nums){

        int min = Integer.MAX_VALUE;

        List<int[]> numList = new ArrayList<>();
        int n =nums.length;
        Arrays.sort(nums);
        for(int i = 0 ; i < n-1 ; i++){
            int val = Math.abs(nums[i] - nums[i+1]);
            if(val < min){
                min = val;
                numList.clear();
                numList.add(new int[]{nums[i],nums[i+1]});
            }else if(val == min){
                numList.add(new int[]{nums[i],nums[i+1]});
            }
            String output = String.format("%s minus %s equals %s" ,nums[i],nums[i+1],val);
            System.out.println(output);

        }

        for( int[] listNum : numList){
            System.out.println(Arrays.toString(listNum));
        }

        return min;


    }
}
