package Challenges;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int n = nums.length;
        int i = 0;
        while (i < n) {
            if (nums[i] == val) {
                for (int a = i; a < n - 1; a++) {
                    nums[a] = nums[a + 1];
                }
                n--;
            } else i++;
        }
        return n;
    }
}
