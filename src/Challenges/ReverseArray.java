package Challenges;

public class ReverseArray {
    public static int[] reverseArray(int[] nums){
        int x = 0;
        int i = nums.length-1;
        while(x < i) {
            int t = nums[x];
            nums[x] = nums[i];
            nums[i] = t;
            x++;
            i--;
        }

        return nums;
    }
}
