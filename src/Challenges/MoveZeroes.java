package Challenges;

public class MoveZeroes {
    public int[] moveZeroes (int[] nums) {
        int n = nums.length;
        int i = 0;
        while (i < n) {
            if (nums[i] == 0) {
                for (int a = i; a < n - 1; a++) {
                    nums[a] = nums[a + 1];
                }
                nums[n-1] = 0;
                n--;
            } else i++;
        }
        return nums;
    }
}
