class Solution {
    public void moveZeroes(int[] nums) {
        int pZ = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[pZ] = nums[i];
                pZ++;
            }
        }
        
        while (pZ < nums.length) {
            nums[pZ] = 0;
            pZ++;
        }
    }
}