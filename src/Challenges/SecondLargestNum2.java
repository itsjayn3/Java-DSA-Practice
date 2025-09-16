package Challenges;

public class SecondLargestNum2 {
    public static int secondLargestNum2(int[]nums){
        int x = 0;
        int y = 0;
        int n = nums.length;

        for(int i = 1 ; i < n ; i++ ){
            if(nums[i] > nums[x]) {
                y = x;
                x = i;

            } else if (nums[i] > nums[y] && nums[i] != nums[x] )
                y=i;
        }
        return nums[y];
    }
}
