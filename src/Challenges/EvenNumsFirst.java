package Challenges;

public class EvenNumsFirst {
    public static int[] evenNumsFirst (int[] nums){

        int[] newArr = new int[nums.length];

        int newEvenIndex = 0;
        int newOddIndex = 0;



        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] % 2 == 0){ // it is an even number
                newArr[newEvenIndex++] = nums[i];

            }

        }

        for(int j = 0 ; j < nums.length ; j++){
            if(nums[j] % 2 != 0){ // it's odd
                newArr[newEvenIndex++] = nums[j];
            }
        }

        return newArr;
    }
}
