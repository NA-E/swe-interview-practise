class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        
        int result = 0;
        
        for (int i = 0, j = nums.length - 2; i <= j; i+=2, j -= 2) {
            if (i == j) {
                result += nums[i];
                continue;
            }
            result += nums[i];
            result += nums[j];
        }
    
        return result;
    }
}