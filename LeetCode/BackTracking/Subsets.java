class Solution {
    
    private List<List<Integer>> result = new ArrayList<> ();
    
    public List<List<Integer>> subsets(int[] nums) {
        int[] flag = new int[nums.length];
        makeSubSets(nums, 0, flag);
        
        return result;
    }
    
    private void makeSubSets(int[] nums, int index, int[] flag) {
        if (index == nums.length) {
            List<Integer> list = new ArrayList<> ();
            
            for (int i = 0; i < flag.length; i++) {
                if (flag[i] == 1) list.add(nums[i]);
            }
            
            result.add(list);
            
            return;
        }
        
        makeSubSets(nums, index + 1, flag);
        flag[index] = 1;
        makeSubSets(nums, index + 1, flag);
        flag[index] = 0;
    }
}