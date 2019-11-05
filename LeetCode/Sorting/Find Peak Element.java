class Solution {
    public int findPeakElement(int[] nums) {
        int result = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                if (i + 1 < nums.length && nums[i] > nums[i+1]) {
                    result = i;
                    break;
                }
            } else if (i == nums.length - 1) {
                if (nums[i] > nums[i-1]) {
                    result = i;
                    break;
                }
            } else {
                if (nums[i] > nums[i-1] && nums[i] > nums[i+1]) {
                    result = i;
                    break;
                    }
            }
            }
            return result;
    }            
    }