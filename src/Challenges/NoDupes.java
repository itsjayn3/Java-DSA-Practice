package Challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NoDupes {
    public static int[] noDupes(int[]nums){
        Arrays.sort(nums); // 2,2,2,2,3,3,4,6,6,10,21 // do the one u said
        // 2,3,4,6,10,21, , , , ,
        //Set<Integer> uNum = new HashSet<>(Arrays.asList(nums));
        List<Integer> uNum = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(!uNum.contains(nums[i]) ){
                uNum.add(nums[i]);
            }
        }
        return uNum.stream().mapToInt(Integer::intValue).toArray();
    }
}
