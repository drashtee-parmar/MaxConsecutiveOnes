public class Solution {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count = 0;
            } else {
                count++;
            }
            max = Math.max(max, count);
        }
        return max;
    }

    public static void main(String[] args) {
//        int nums[] = {1,1,0,1,1,1}; // output = 3
        int nums[] = {1,0,1,1,0,1}; // output = 2

        System.out.println(findMaxConsecutiveOnes(nums));
    }
}

