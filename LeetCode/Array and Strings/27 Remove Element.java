class Solution {
    public int removeElement(int[] nums, int val) {
        int pZ = 0;
        
        for (int i = 0; i  nums.length; i++) {
            if (nums[i] != val) {
                nums[pZ] = nums[i];
                pZ++;
            }
        }
        
        return pZ;
    }
}