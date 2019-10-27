class Solution {
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        
        revers(nums, 0, nums.length - 1);
        revers(nums, 0, k - 1);
        revers(nums, k, nums.length-1);
    }
    
    private void revers(int[] nums, int start, int end) {
        for (int i = start, j = end; i < j; i++, j--) {
            int tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }
    }
}