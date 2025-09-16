package Challenges;

public class Sum {
    public static int sum(int[] nums){
        int n = nums.length;
        int total = 0;
        for( int i = 0; i < n ; i++){
            total = total + nums[i];
        }
        return total;
    }
}
